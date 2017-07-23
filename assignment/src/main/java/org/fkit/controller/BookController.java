package org.fkit.controller;

import java.util.List;

import org.fkit.domain.Book;
import org.fkit.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * 处理图书请求控制器
 * */
@Controller
public class BookController {
	
	/**
	 * 自动注入BookService
	 * */
	@Autowired
	@Qualifier("bookService")
	private BookService bookService;

	/**
	 * 处理/main请求
	 * */
	@RequestMapping(value="/main")
	 public String main(Model model){
		// 获得所有图书集合
		List<Book> book_list = bookService.getAll();
		// 将图书集合添加到model当中
		model.addAttribute("book_list", book_list);
		// 跳转到main页面
		return "main";
	}
	
	/**
	 * 处理/Education请求
	 * */
	@RequestMapping(value="/Education")
	 public String Education(Model model){
		// 获得所有图书集合
		List<Book> book_list = bookService.getAllEducation();
		// 将图书集合添加到model当中
		model.addAttribute("book_list", book_list);
		// 跳转到Education页面
		return "Education";
	}
	
	/**
	 * 处理/Art请求
	 * */
	@RequestMapping(value="/Art")
	 public String Art(Model model){
		// 获得所有图书集合
		List<Book> book_list = bookService.getAllArt();
		// 将图书集合添加到model当中
		model.addAttribute("book_list", book_list);
		// 跳转到Art页面
		return "Art";
	}
	
	/**
	 * 处理/Bookdetail/{book_id}
	 */
	@RequestMapping(value="/bookdetail")
	public ModelAndView bookdetail(@RequestParam("book_id") Integer book_id, Model model,ModelAndView mv){
		Book book = bookService.getbookdetail(book_id);
		mv.addObject("book",book);
		mv.setViewName("bookdetail");
		return mv;
		
	}
}
