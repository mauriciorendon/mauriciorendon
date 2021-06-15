package com.inmemory.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Post")
public class Post {
	
	@Id
	private int userId;
	private String strPost;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getStrPost() {
		return strPost;
	}
	public void setStrPost(String strPost) {
		this.strPost = strPost;
	}
}
