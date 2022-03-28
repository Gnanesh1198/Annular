package com.annularTechnologies.developerConnect.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.annularTechnologies.developerConnect.Model.PostEntity;


@Repository
public interface PostRepository extends JpaRepository<PostEntity, Long>{
	
//	@Query("Select dev_id from PostEntity dev_id where dev_id = dev_id")
//	Page<PostEntity> findByDeveloperId(Long devId, Pageable pageable);

}
