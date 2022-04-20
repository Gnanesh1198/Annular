package com.annularTechnologies.developerConnect.service;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.annularTechnologies.developerConnect.Model.BlogsEntity;
import com.annularTechnologies.developerConnect.repository.BlogsRepository;
import com.annularTechnologies.developerConnect.repository.DeveloperRepository;

@Service
public class BlogsService {
	
	@Autowired
	BlogsRepository blogsRepo;
	
	@Autowired
	DeveloperRepository devRepo;
	
	public BlogsEntity saveBlogs(MultipartFile file, String content, Long devId) throws IOException	 {
		String filename = file.getOriginalFilename();
		BlogsEntity blogsEntity = new BlogsEntity();
		blogsEntity.setImage(file.getBytes());
		blogsEntity.setContent(content);
		blogsEntity.setDeveloperEntity(devRepo.getById(devId)); 
		
		return blogsRepo.save(blogsEntity);
	}
	
	public List<BlogsEntity> getAllBlogs(){
		return blogsRepo.findAll();
	}
	
//	public Optional<Object> saveBlogs(@PathVariable(value ="devId") Long devId, @RequestBody BlogsEntity blogs){
//		
//		return devRepo.findById(devId).map(developer -> {
//			blogs.setDeveloperEntity(developer);
//			return blogsRepo.save(blogs);
//		});
//	}
//
//	public Optional<Object> update(Long blogId, BlogsEntity blogs) {
//		return blogsRepo.findById(blogId).map(blog ->{
//			blog.setContent(blogs.getContent());
//			return blogsRepo.save(blog);
//		});
//	}
//
//	public Optional<Object> delete(Long blogId) {
//		return blogsRepo.findById(blogId).map(blog ->{
//			blogsRepo.delete(blog);
//			return ResponseEntity.ok().build();
//		});
//	}
	
	

}
