package com.annularTechnologies.developerConnect.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.annularTechnologies.developerConnect.Model.DeveloperEntity;

@Repository
public interface DeveloperRepository extends JpaRepository<DeveloperEntity, Long> {
	
	@Query("Select dev.mobile from DeveloperEntity dev where dev.mobile = :mobile")
	public List<String> findByMobile(@Param("mobile") String mobile);



}
