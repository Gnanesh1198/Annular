package com.annularTechnologies.developerConnect.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.annularTechnologies.developerConnect.Model.JobsEntity;
import com.annularTechnologies.developerConnect.dto.JobsDto;
import com.annularTechnologies.developerConnect.repository.JobsRepository;

@Service
public class JobsService {
	
	@Autowired
	JobsRepository jobsRepo;
	
	public JobsEntity jobs(@RequestBody JobsDto jobsDto) {
		
		JobsEntity jobs = new JobsEntity();
		
		
		jobs.setJob_title(jobsDto.getJob_title());
		jobs.setJobs_shore_desc(jobsDto.getJobs_shore_desc());
		jobs.setJob_description(jobsDto.getJob_description());
		jobs.setAttachment(jobsDto.getAttachment());
		jobs.setSkills(jobsDto.getSkills());
		jobs.setRecruitment_type(jobsDto.getRecruitment_type());
		jobs.setPer_hour_cost(jobsDto.getPer_hour_cost());
		jobs.setBudget_type(jobsDto.getBudget_type());
		jobs.setSalary(jobsDto.getSalary());
		jobs.setProject_status(jobsDto.getProject_status());
		
//		ArrayList<JobsEntity> list = new ArrayList<>();
		
		jobsRepo.save(jobs);
		
		return jobs;
		
		
	}
	
	public ResponseEntity<JobsEntity> updateJobs(@PathVariable int jobsid,@Valid @RequestBody JobsDto jobsDto){
		
		JobsEntity jobs = jobsRepo.getById(jobsid);
		
		jobs.setJob_title(jobsDto.getJob_title());
		jobs.setJobs_shore_desc(jobsDto.getJobs_shore_desc());
		jobs.setJob_description(jobsDto.getJob_description());
		jobs.setAttachment(jobsDto.getAttachment());
		jobs.setSkills(jobsDto.getSkills());
		jobs.setRecruitment_type(jobsDto.getRecruitment_type());
		jobs.setPer_hour_cost(jobsDto.getPer_hour_cost());
		jobs.setBudget_type(jobsDto.getBudget_type());
		jobs.setSalary(jobsDto.getSalary());
		jobs.setProject_status(jobsDto.getProject_status());
		
		
		JobsEntity updatedJobs = jobsRepo.save(jobs);
		
		return ResponseEntity.ok(updatedJobs);
		
	}
	
	

	
	public JobsEntity jobsById(@RequestParam Integer jobid){
		
		Optional<JobsEntity> optional = jobsRepo.findById(jobid);
		
		if(optional.isPresent()) {
			return optional.get();
			}
		
		return optional.get();
			

		
	}
	

}
