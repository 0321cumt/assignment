package org.fkit.service;


import java.util.List;

import org.fkit.domain.User;

/**
 * User服务层接口
 * */
public interface UserService {

	/**
	 * 判断用户登录
	 * @param String loginname
	 * @param String password
	 * @return 找到返回User对象，没有找到返回null
	 * */
	User login(String loginname,String password);
	//User register(String loginname,String username, String password, String phone, String adress);
		/**
		 * 添加用户
		 * @Param User 用户对象 
		 * */
	void addUser(User user);
	
	User findPassword(String loginname);
	User findPasswordEmail(String loginname,String mail);

}
