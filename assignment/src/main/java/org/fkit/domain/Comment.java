package org.fkit.domain;

import java.io.Serializable;
import java.util.List;


public class Comment implements Serializable{
	
	private Integer id;				//id	
	private Integer book_id;			// book_id
	private Integer user_id;		//user_id
	private String username;		//username
	private String picture;			//图片评论
	private String details;			//文字评论
	private String scoring; 		//打分
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getBook_id() {
		return book_id;
	}
	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getScoring() {
		return scoring;
	}
	public void setScoring(String scoring) {
		this.scoring = scoring;
	}
	@Override
	public String toString() {
		return "Comment [id=" + id + ",book_id=" + book_id + ","
				+ "user_id=" + user_id + ",username=" + username + ","
						+ "picture=" + picture + ",details=" + details + ","
								+ "scoring=" + scoring + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
