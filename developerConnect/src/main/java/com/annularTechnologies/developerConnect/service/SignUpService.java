package com.annularTechnologies.developerConnect.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import com.annularTechnologies.developerConnect.Model.DeveloperEntity;
import com.annularTechnologies.developerConnect.dto.DeveloperSignUpDto;
import com.annularTechnologies.developerConnect.repository.DeveloperRepository;


@Service
public class SignUpService {
	
	@Autowired
	DeveloperRepository developerRepo;
//	
//	@Autowired
//	CompanyRepository companyRepo;
//	
//	public Map<String, String> registerCompany(CompanySignUpDto companySignUpDto) {
//
//		CompanyEntity company = new CompanyEntity();
//
//		company.setName(companySignUpDto.getName());
//		company.setLocation(companySignUpDto.getAddress());
//		company.setPassword(companySignUpDto.getPassword());
//
//		Map<String, String> response = new HashMap<>();
//		response.put("name", company.getName());
//		response.put("Address", company.getLocation());
//
//		try {
//			companyRepo.save(company);
//			return response;
//		} catch (DataIntegrityViolationException e) {
//			// TODO: handle exception
//			response.clear();
//			response.put("message", "Company name already exist");
//			return response;
//		}
//
//	}
//	
	public Map<String, String> registerDeveloper(@RequestBody DeveloperSignUpDto developerReq) {
		System.out.println("service");
		Map<String, String> response = new HashMap<>();
		if (developerRepo.findByMobile(developerReq.getMobile()).size() == 0) {
			DeveloperEntity developer = new DeveloperEntity();
			developer.setUsername(developerReq.getUsername());
			developer.setMobile(developerReq.getMobile());
			developer.setSkills(developerReq.getSkills());
			developer.setExperience(developerReq.getExperience());
			developer.setProject(developerReq.getProject());
			developer.setEmail(developerReq.getEmail());
			
			developerRepo.save(developer);
			
			response.put("message", "Success");
			return response;
		} else {
			response.put("message", "Mobile number is already exist");
			return response;
		}

	
//	public ResponseEntity<HashMap<String, String>> developerLogin(@RequestParam ("emailid") String emailid, @RequestParam("password") String password){
//		
//		HashMap<String, String> map = new HashMap<>();
//		List<DeveloperEntity> dev = developerRepo.findAll();
//		
//		for(DeveloperEntity developer : dev) {
//			if(emailid.equals(developer.getEmailid()) && password.equals(developer.getPassword())) {
//				map.put("emailid", emailid);
//				map.put("data", developer.getId().toString());
//				return ResponseEntity.status(HttpStatus.OK).body(map);
//			}
//		}
//		map.put("status", "404");
//		map.put("message", "notfound");
//		 return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
//		
//	}
//	
//	public ResponseEntity<HashMap<String, String>> companyLogin(@RequestParam ("companyname") String name,@RequestParam ("password") String password){
//		
//		HashMap<String, String> map = new HashMap<>();
//		List<CompanyEntity> companyusers = companyRepo.findAll();
//		
//		for(CompanyEntity company : companyusers) {
//			if(name.equals(company.getName()) && password.equals(company.getPassword())) {
//				map.put("emailid", name);
//				map.put("data", company.getId().toString());
//				return ResponseEntity.status(HttpStatus.OK).body(map);
//			}
//		}
//		map.put("status", "404");
//		map.put("message", "notfound");
//		 return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
//		
//		
//	}

}
}

