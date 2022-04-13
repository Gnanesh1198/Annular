package com.annularTechnologies.developerConnect.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.annularTechnologies.developerConnect.Model.BlogsEntity;
import com.annularTechnologies.developerConnect.Model.SkillTestEntity;
import com.annularTechnologies.developerConnect.repository.BlogsRepository;
import com.annularTechnologies.developerConnect.repository.SkillTestRepository;
import com.annularTechnologies.developerConnect.service.BlogsService;


@RestController
@RequestMapping("/blogs")
public class BlogsController {
	
	@Autowired
	BlogsRepository blogsRepo;
	
	@Autowired
	BlogsService blogsService;
	
	@GetMapping("/getBlogs")
	public List<BlogsEntity> getBlogs() {
		return blogsRepo.findAll();
	}
	
	@PostMapping("/createBlogs/{devId}")
	public Optional<Object> createBlogs(@PathVariable(value ="devId") Long devId, @RequestBody BlogsEntity blogs){
		return blogsService.saveBlogs(devId, blogs);
	}
	
	
	@PutMapping("/{blogId}")
	public Optional<Object> updateBlogs(@PathVariable(value = "blogId") Long blogId, @RequestBody BlogsEntity blogs){
		return blogsService.update(blogId, blogs);
	}
	
	@DeleteMapping("/{blogId}")
	public Optional<Object> deleteBlog(@PathVariable(value = "blogId") Long blogId){
		return blogsService.delete(blogId);
	}


}
