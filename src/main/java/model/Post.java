package model;

import java.sql.Timestamp;

import javax.persistence.Table;


public class Post {
	
	private String id;
	private String userId;
	private String title;
	private String content;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	
}
