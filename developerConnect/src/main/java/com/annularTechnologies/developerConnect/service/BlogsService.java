package com.annularTechnologies.developerConnect.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.annularTechnologies.developerConnect.Model.BlogsEntity;
import com.annularTechnologies.developerConnect.Model.DeveloperEntity;
import com.annularTechnologies.developerConnect.Model.SkillTestEntity;
import com.annularTechnologies.developerConnect.repository.BlogsRepository;
import com.annularTechnologies.developerConnect.repository.DeveloperRepository;
import com.annularTechnologies.developerConnect.repository.SkillTestRepository;

@Service
public class BlogsService {
	
	@Autowired
	BlogsRepository blogsRepo;
	
	@Autowired
	DeveloperRepository devRepo;
	
	public Optional<Object> saveBlogs(@PathVariable(value ="devId") Long devId, @RequestBody BlogsEntity blogs){
		
		return devRepo.findById(devId).map(developer -> {
			blogs.setDeveloperEntity(developer);
			return blogsRepo.save(blogs);
		});
	}

	public Optional<Object> update(Long blogId, BlogsEntity blogs) {
		return blogsRepo.findById(blogId).map(blog ->{
			blog.setContent(blogs.getContent());
			return blogsRepo.save(blog);
		});
	}

	public Optional<Object> delete(Long blogId) {
		return blogsRepo.findById(blogId).map(blog ->{
			blogsRepo.delete(blog);
			return ResponseEntity.ok().build();
		});
	}
	
	

}
