package com.inmemory.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inmemory.models.Post;
import com.inmemory.repository.PostRepository;

@RestController
public class PostController {
	
	@Autowired
	private PostRepository postRepository;
	
	@PostMapping("/addPost")
	public String savePost(@RequestBody Post post) {
		try {
			postRepository.save(post);
		} catch(Exception e) {
			return "Error: " + e;
		}
		return "Post Created";
	}
	
	@GetMapping("/getPosts")
	public List<Post> getUsers(){
		return postRepository.findAll();
	}

}
