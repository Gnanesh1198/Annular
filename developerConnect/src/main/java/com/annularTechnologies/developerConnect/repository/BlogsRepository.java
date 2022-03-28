package com.annularTechnologies.developerConnect.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.annularTechnologies.developerConnect.Model.BlogsEntity;

@Repository
public interface BlogsRepository extends JpaRepository<BlogsEntity, Long>{

//	Optional<Object> findByBlogIdandPostId(Long blogId, Long devId);

}
