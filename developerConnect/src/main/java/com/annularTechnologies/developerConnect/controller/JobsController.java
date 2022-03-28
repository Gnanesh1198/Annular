package com.annularTechnologies.developerConnect.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.annularTechnologies.developerConnect.Model.JobsEntity;
import com.annularTechnologies.developerConnect.Model.PostEntity;
import com.annularTechnologies.developerConnect.dto.JobsDto;
import com.annularTechnologies.developerConnect.repository.JobsRepository;
import com.annularTechnologies.developerConnect.repository.PostRepository;
import com.annularTechnologies.developerConnect.service.JobsService;

@RestController
@RequestMapping("/devconnect/jobs")
public class JobsController {
	
	@Autowired
	JobsService jobsService;
	
	@Autowired
	JobsRepository jobsRepo;
	
	
	@PostMapping("/createJobs")
	public JobsEntity jobsHandler(@RequestBody JobsDto jobsDto) {
		
		return jobsService.jobs(jobsDto);
	}
	
	@GetMapping("/allJobs")
	public List<JobsEntity> getAllJobs(){
		return jobsRepo.findAll();
	}
	
	@GetMapping("/getById")
	public JobsEntity getById(@RequestParam Integer jobid) {
		return jobsService.jobsById(jobid);
	}
	

}
