package com.annularTechnologies.developerConnect.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.annularTechnologies.developerConnect.Model.RecruiterEntity;

@Repository
public interface RecruiterRepository extends JpaRepository<RecruiterEntity, Long>{

//	String existByEmailId(String email_id);
	@Query("Select dev.email_id from RecruiterEntity dev where dev.email_id = :email_id")
	public List<String> findByEmailId(@Param("email_id") String email_id);

}
