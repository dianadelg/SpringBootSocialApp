package com.example.socialapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.socialapp.model.Post;

@RestController
public class PostController {
	/*
	 * Handles HTTP GET requests to /posts.
	 * Returns a list of Post objects.
	 */
	@GetMapping("/posts")
	public List<Post> getPosts() {

	    /*
	     * Create an empty list that will hold Post objects.
	     */
	    List<Post> posts = new ArrayList<>();
	    
		
	    /* Create a new Post object using
	     * the constructor we wrote earlier.
	     */
	    Post post1 = new Post(
	        1L,
	        "Diana",
	        "Learning Spring Boot!"
	    );
	    
	    posts.add(post1);
	    
	    Post post2 = new Post(
		        2L,
		        "Alexa",
		        "Learning Spring Boot!"
		    );
	    
	    posts.add(post2);

	    /*
	     * Return the list of posts to Spring.
	     */
	    return posts;
	}
}
