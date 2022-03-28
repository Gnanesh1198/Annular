package com.annularTechnologies.developerConnect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


import com.annularTechnologies.developerConnect.Model.DeveloperEntity;
import com.annularTechnologies.developerConnect.dto.DeveloperSignUpDto;
import com.annularTechnologies.developerConnect.repository.DeveloperRepository;
import com.annularTechnologies.developerConnect.service.SignUpService;

@RestController
@RequestMapping("/devconnect/CreateProfile")
public class AuthController {
	
	@Autowired
	SignUpService signUp;
	
	@Autowired
	DeveloperRepository developerRepo;

	
	@PostMapping("/developerSignUp")
	public Map<String, String> developerSignUp(@RequestBody DeveloperSignUpDto developerReq) {
	   System.out.println("controller");
       return  signUp.registerDeveloper(developerReq);
	}
	
	
	@GetMapping("/devs")
	public List<DeveloperEntity> getAllDevs(){
		System.out.println("devs");
		return developerRepo.findAll();
	}
	

}
