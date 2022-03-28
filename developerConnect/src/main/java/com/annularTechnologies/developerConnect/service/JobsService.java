package com.annularTechnologies.developerConnect.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
		
		jobs.setTitle(jobsDto.getTitle());
		jobs.setDescription(jobsDto.getDescription());
		jobs.setJobstype(jobsDto.getJobstype());
		jobs.setSalary(jobsDto.getSalary());
		jobs.setHourlycharge(jobsDto.getHourlycharge());
		jobs.setExplevel(jobsDto.getExplevel());
		jobs.setSkillset(jobsDto.getSkillset());
		jobs.setNoticeperiod(jobsDto.getNoticeperiod());
		jobs.setHrsweek(jobsDto.getHrsweek());
		jobs.setPremiumjobs(jobsDto.getPremiumjobs());
		
		jobsRepo.save(jobs);
		
		return jobs;
		
		
	}
	
	public JobsEntity jobsById(@RequestParam Integer jobid){
		
		Optional<JobsEntity> optional = jobsRepo.findById(jobid);
		
		if(optional.isPresent()) {
			return optional.get();
			}
		
		return optional.get();
			

		
	}
	

}
