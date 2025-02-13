package model;

import java.sql.Timestamp;

import javax.persistence.Table;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



public class UserAuth {
	

	private String id;
	private String email;
	private String password;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
