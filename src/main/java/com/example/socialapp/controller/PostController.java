package com.example.socialapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.socialapp.model.Post;
import com.example.socialapp.service.PostService;

@RestController
public class PostController {
	
	/*
	 * The controller depends on PostService.
	 * final means this field cannot be reassigned
	 * after it has been initialized.
	 */
	private final PostService postService;

	/*
	 * Spring calls this constructor when it creates
	 * the PostController bean.
	 *
	 * Spring supplies the PostService bean
	 * as the constructor argument.
	 */
	public PostController(PostService postService) {
	    this.postService = postService;
	}
	
	/*
	 * Handles HTTP GET requests to /posts.
	 * Returns a list of Post objects.
	 */
	@GetMapping("/posts")
	public List<Post> getPosts() {
	    /*
	     * Call the getPosts() method on the
	     * PostService object Spring injected.
	     */
		return postService.getPosts(); //dependency injection
	}
}
