package org.fkit.controller;

import static org.junit.Assert.*;

import org.fkit.domain.User;
import org.fkit.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lystest.lystest;

public class UserControllerTest extends lystest{
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testLogin() {
		User user = userService.login("", "");
		if(user != null){
			System.out.println("恭喜你登陆成功");
		}else{
			System.out.println("用户名或密码错误");
		}
	}

	@Test
	public void testAddUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testFind() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdatepsaaword() {
		fail("Not yet implemented");
	}

}
