package com.annularTechnologies.developerConnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.annularTechnologies.developerConnect.Model.JobsEntity;


@Repository
public interface JobsRepository extends JpaRepository<JobsEntity, Integer>{

//	JobsEntity findById(Class<JobsEntity> class1, Integer jobid);
	
//	public JobsEntity

}
