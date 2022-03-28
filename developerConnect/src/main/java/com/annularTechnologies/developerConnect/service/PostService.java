package com.annularTechnologies.developerConnect.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.annularTechnologies.developerConnect.Model.DeveloperEntity;
//import com.annularTechnologies.developerConnect.Model.DeveloperEntity;
//import com.annularTechnologies.developerConnect.Model.PostDetails;
import com.annularTechnologies.developerConnect.Model.PostEntity;
import com.annularTechnologies.developerConnect.dto.DeveloperDto;
import com.annularTechnologies.developerConnect.dto.PostDto;
import com.annularTechnologies.developerConnect.repository.DeveloperRepository;
//import com.annularTechnologies.developerConnect.repository.PostDetailsRepo;
import com.annularTechnologies.developerConnect.repository.PostRepository;

@Service
public class PostService {
	
	@Autowired
	PostRepository postRepo;
	
	@Autowired
	DeveloperRepository devRepo;
	
	public Optional<Object> createPost(@PathVariable(value = "devId") Long devId, @RequestBody PostEntity post) {
		
		return devRepo.findById(devId).map(developer ->{
			post.setDeveloperEntity(developer);
			return postRepo.save(post);
		});
		}

	public Optional<Object> update(Long postId, PostEntity posts) {
		return postRepo.findById(postId).map(post ->{
			post.setQuery(posts.getQuery());
			return postRepo.save(post);
		});
	}

	public Optional<Object> delete(Long postId) {
		return postRepo.findById(postId).map(post ->{
			postRepo.delete(post);
			return ResponseEntity.ok().build();
		});
	}
	
//	public Page<PostEntity> PostByDevId(@PathVariable(value = "devId") Long devId, Pageable pageable){
//		return postRepo.findByDeveloperId(devId, pageable);
//	}

	

	}


