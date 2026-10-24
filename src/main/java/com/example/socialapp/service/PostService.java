package com.example.socialapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.socialapp.model.Post;

/*
 * @Service tells Spring that this class
 * is part of our application's service layer.
 *
 * Spring will create and manage an instance
 * of this class as a Spring bean.
 */
@Service
public class PostService {

	/*
	 * Returns a list of posts. For now, the posts are hardcoded. Later, we will
	 * retrieve them from a database.
	 */
	public List<Post> getPosts() {
		/*
		 * Create an empty list that will hold Post objects.
		 */
		List<Post> posts = new ArrayList<>();

		/*
		 * Create a new Post object using the constructor we wrote earlier.
		 */
		Post post1 = new Post(1L, "Diana", "Learning Spring Boot!");

		posts.add(post1);

		Post post2 = new Post(2L, "Alexa", "Learning Spring Boot!");

		posts.add(post2);

		/*
		 * Return the list of posts to Spring.
		 */
		return posts;
	}

}
