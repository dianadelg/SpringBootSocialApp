package com.example.socialapp.model;

public class Post {
	 /*
     * A unique identifier for each post.
     * Long allows us to store large whole numbers.
     */
    private Long id;

    /*
     * The name of the person who created the post.
     */
    private String author;

	/*
     * The text content of the post.
     */
    private String content;

    /*
     * Constructor:
     * Creates a new Post object with an ID,
     * an author, and content.
     */
    public Post(Long id, String author, String content) {
        this.id = id;
        this.author = author;
        this.content = content;
    }
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
