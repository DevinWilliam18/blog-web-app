package model;

import java.sql.Timestamp;

import javax.persistence.Table;


public class Post {
	
	private String id;
	private UserProfile userProfile;
	private String title;
	private String content;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	
}
