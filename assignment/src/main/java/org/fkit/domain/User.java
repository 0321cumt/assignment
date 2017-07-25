package org.fkit.domain;

import java.io.Serializable;

/**
 * CREATE TABLE user(
user_id INT PRIMARY KEY AUTO_INCREMENT,      #id
loginname VARCHAR(20) UNIQUE,		#登录名  
password VARCHAR(20),			#密码
user_name VARCHAR(20),			#用户名
phone VARCHAR(20),			#电话
address VARCHAR(225),       #地址
);

 * */
public class User implements Serializable{

	private Integer user_id;			// user_id
	private String loginname;	// 登录名
	private String username;	// 用户名
	private String password;	// 密码
	private String phone;		// 电话
	private String address;		//地址
	private String mail;		//邮箱
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
		
	
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", loginname=" + loginname + ", username=" + username + ",password="
				+ password + ",  phone=" + phone + ", address=" + address + ",mail=" + mail + "]";
	}

	

	
	
	
}
