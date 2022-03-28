package com.annularTechnologies.developerConnect.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.annularTechnologies.developerConnect.dto.RecruiterDto;
import com.annularTechnologies.developerConnect.service.RecruiterService;

@RestController
@RequestMapping("/Recruiter")
public class RecruiterController {
	
	@Autowired
	RecruiterService recruiterService;
	
	@PostMapping("/signUp")
	public Map<String, String> signUp(@RequestBody RecruiterDto recruiterDto){
		return recruiterService.RecruiterSignUp(recruiterDto);
	}
	
	@GetMapping("/login")
	public ResponseEntity<HashMap<String, String>> login(@RequestParam("EmailId") String email_id, @RequestParam("Password") String password){
		return recruiterService.recruiterLogin(email_id,password);
	}

}
