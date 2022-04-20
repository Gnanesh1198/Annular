package com.annularTechnologies.developerConnect.controller;

import java.io.IOException;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

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
	
	@PostMapping("/addBlogs")
	public BlogsEntity uploadBlog(@RequestParam("image")  MultipartFile file, @RequestParam("content")  String content, @RequestParam("devId")  Long devId ) throws IOException {
		return blogsService.saveBlogs(file, content, devId);
	}
	
	@GetMapping("/getBlogs")
	public List<BlogsEntity> AllBlogs() {
		return blogsService.getAllBlogs();
	}
}
