package com.annularTechnologies.developerConnect.controller;

import java.util.List;
import java.util.Optional;

import javax.management.AttributeNotFoundException;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.annularTechnologies.developerConnect.Model.DeveloperEntity;
import com.annularTechnologies.developerConnect.Model.PostEntity;
import com.annularTechnologies.developerConnect.dto.PostDto;
import com.annularTechnologies.developerConnect.repository.DeveloperRepository;
import com.annularTechnologies.developerConnect.repository.PostRepository;
import com.annularTechnologies.developerConnect.service.PostService;

@RestController
@RequestMapping("/post")
public class PostController {
	
	@Autowired
	PostService postService;
	
	@Autowired
	DeveloperRepository devRepo;
	
	@Autowired
	PostRepository postRepo;
	
	@PostMapping("/developer/{devId}/posts")
	public Optional<Object> createPost(@PathVariable(value = "devId") Long devId, @RequestBody PostEntity post) {	
	return postService.createPost(devId, post);
	}
	
	@GetMapping("/allPost")
	public List<PostEntity> allPosts() {
		return postRepo.findAll();
	}
	
	@PutMapping("/{postId}")
	public Optional<Object> updatePost(@PathVariable(value = "postId") Long postId, @RequestBody PostEntity posts) {
		return postService.update(postId, posts);
	}
	
	@DeleteMapping("/{postId}")
	public Optional<Object> deletePost(@PathVariable(value = "postId") Long postId){
		return postService.delete(postId);
	}
	
//	@GetMapping("/allPostByDevId/{devId}")
//	public Page<PostEntity> getAllPostByDevId(@PathVariable(value = "devId") Long devId, Pageable pageable){
//		return postService.PostByDevId(devId, pageable);
//	}

}
