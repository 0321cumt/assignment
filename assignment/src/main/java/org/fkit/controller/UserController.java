package org.fkit.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.fkit.domain.User;
import org.fkit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 * 处理用户请求控制器
 * */
@Controller
public class UserController {
	
	/**
	 * 自动注入UserService
	 * */
	@Autowired
	@Qualifier("userService")
	private UserService userService;

	/**
	 * 处理/login请求
	 * */
	@RequestMapping(value="/login")
	 public ModelAndView login(
			 String loginname,String password,
			 ModelAndView mv,
			 HttpSession session){
		// 根据登录名和密码查找用户，判断用户登录
		User user = userService.login(loginname, password);
		if(user != null){
			// 登录成功，将user对象设置到HttpSession作用范围域
			session.setAttribute("user", user);
			// 转发到main请求
			mv.setView(new RedirectView("./index"));
		}else{
			// 登录失败，设置失败提示信息，并跳转到登录页面
			mv.addObject("message", "登录名或密码错误，请重新输入!");
			mv.setViewName("/loginForm");
		}
		return mv;
	}
	 
	/**
	 * 处理添加请求
	 * @param User user 要添加用户的对象
	 * @param ModelAndView mv
	 **/
	@RequestMapping(value = "/regist")
	public ModelAndView addUser(
			@ModelAttribute User user,
			ModelAndView mv){
				userService.addUser(user);
				//创建User对象
			
			mv.setViewName("loginForm");
				return mv;
	}
    
	@RequestMapping(value="/find")
	 public ModelAndView find(String loginname,String mail,ModelAndView mv,HttpSession session,HttpServletResponse response) throws Exception{		
		User user=userService.findPasswordEmail(loginname, mail);	
	if(user!=null){
			StringBuffer url=new StringBuffer();
			StringBuilder builder=new StringBuilder();
			//邮件的正文
			builder.append("");
			url.append("您的密码是："+user.getPassword()+"");
			builder.append("");
			builder.append(""+url+"");
			builder.append("");
			SimpleEmail sendemail=new SimpleEmail();
			sendemail.setHostName("smtp.163.com");
			sendemail.setAuthentication("15651356293@163.com","luo123");
			sendemail.setCharset("UTF-8");
			try{
				sendemail.setCharset("UTF-8");
				sendemail.addTo(mail);
				sendemail.setFrom("15651356293@163.com");
				sendemail.setSubject("找回密码");
				sendemail.setMsg(builder.toString());
				sendemail.send();
			}catch(EmailException e){
				e.printStackTrace();
			}
			
			mv.setViewName("loginForm");
		}else{		
			
			response.getWriter().println("密码获取失败！");
		}
		return mv;	
		
	}

	

}