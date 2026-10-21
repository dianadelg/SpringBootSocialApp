package com.example.socialapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.socialapp.model.Post;

@RestController
public class PostController {
	/*
	 * Handles HTTP GET requests to /posts.
	 * Instead of returning a String, this method
	 * returns an actual Post object.
	 */
	@GetMapping("/posts")
	public Post getPosts() {

	    /* Create a new Post object using
	     * the constructor we wrote earlier.
	     */
	    Post post = new Post(
	        1L,
	        "Diana",
	        "Learning Spring Boot!"
	    );

	    /* Return the Post object to Spring.*/
	    return post;
	}
}
