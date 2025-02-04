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
	
	
}
