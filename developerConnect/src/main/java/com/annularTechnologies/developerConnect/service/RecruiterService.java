package com.annularTechnologies.developerConnect.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.annularTechnologies.developerConnect.Model.RecruiterEntity;
import com.annularTechnologies.developerConnect.dto.RecruiterDto;
import com.annularTechnologies.developerConnect.repository.RecruiterRepository;

@Service
public class RecruiterService {
	
	@Autowired
	RecruiterRepository recruiterRepo;
	
	public Map<String, String> RecruiterSignUp(@RequestBody RecruiterDto recruiterDto){
		
		if(recruiterRepo.findByEmailId(recruiterDto.getEmail_id()).size() == 0) {
			RecruiterEntity recruiterEntity = new RecruiterEntity();
			recruiterEntity.setEmail_id(recruiterDto.getEmail_id());
			recruiterEntity.setUsername(recruiterDto.getUsername());
			recruiterEntity.setMobile(recruiterDto.getMobile());
			recruiterEntity.setPassword(recruiterDto.getPassword());
			
			Map<String, String> response = new HashMap<>();
			
			response.put("emailId", recruiterEntity.getEmail_id());
			response.put("username", recruiterEntity.getUsername());
			response.put("mobile", recruiterEntity.getMobile());
			response.put("respCode", "00");
			
			recruiterRepo.save(recruiterEntity);
			return response;
		}else {
			Map<String, String> response2 = new HashMap<>();
			
			response2.put("message", "EmailId already exists");
			response2.put("respCode", "ER");
			return response2;
		}
	}
	
	
	public ResponseEntity<HashMap<String, String>> recruiterLogin(@RequestParam("EmailId") String email_id, @RequestParam("Password") String password){
		HashMap<String,String> map = new HashMap<>();
		List<RecruiterEntity> recruiter = recruiterRepo.findAll();
		
		for(RecruiterEntity object : recruiter) {
			if(email_id.equals(object.getEmail_id()) && password.equals(object.getPassword())) {
				
				
				
				map.put("Email", email_id);
				map.put("data", object.getId().toString());
				return ResponseEntity.status(HttpStatus.OK).body(map);
			}
		}
		HashMap<String,String> map1 = new HashMap<>();
		
		map1.put("message", "login failed");
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map1);
		
		
		
	}

}
