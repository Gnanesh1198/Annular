package com.annularTechnologies.developerConnect.controller;

import java.util.List;
import java.util.Optional;

import javax.management.AttributeNotFoundException;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.annularTechnologies.developerConnect.Model.DeveloperEntity;
import com.annularTechnologies.developerConnect.Model.SkillTestEntity;
import com.annularTechnologies.developerConnect.dto.SkillTestDto;
import com.annularTechnologies.developerConnect.repository.DeveloperRepository;
import com.annularTechnologies.developerConnect.repository.SkillTestRepository;
import com.annularTechnologies.developerConnect.service.SkillTestService;

@RestController
@RequestMapping("/skillTest")
public class SkillTestController {
	
	@Autowired
	SkillTestService skillTestService;
	
	@Autowired
	DeveloperRepository devRepo;
	
	@Autowired
	SkillTestRepository skillTestRepo;
	
	@GetMapping("/getAllLanguages")
	public List<SkillTestEntity> getAllLanguage() {
		
		return skillTestRepo.findAll();
		
	}
	
	@PostMapping("/addLanguages")
	public SkillTestEntity addLanguage(@RequestBody SkillTestDto skillTestDto) {
		return skillTestService.createLanguage(skillTestDto);
	}


}
