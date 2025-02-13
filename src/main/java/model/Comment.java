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
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Post getPostId() {
		return postId;
	}
	public void setPostId(Post postId) {
		this.postId = postId;
	}
	public UserProfile getUserId() {
		return userId;
	}
	public void setUserId(UserProfile userId) {
		this.userId = userId;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}	
	
}