package model;

import java.sql.Timestamp;

import javax.persistence.Table;


public class Comment {
	
	private String id;
	private Post postId;
	private UserProfile userId;
	private String commentContent;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	
}
	