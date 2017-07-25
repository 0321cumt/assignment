package org.fkit.service;

import java.util.List;

import org.fkit.domain.Book;

/**
 * Book服务层接口
 * */
public interface BookService {
	
	/**
	 * 查找所有图书
	 * @param book_name 
	 * @return Book对象集合
	 * */
	List<Book> getAll();
	
	/**
	 * 查找教育类图书
	 * @return Book对象集合
	 * */
	List<Book> getAllEducation();
	
	/**
	 * 查找文艺类图书
	 * @return Book对象集合
	 * */
	List<Book> getAllArt();
	
	/**
	 * 查找选择详情商品
	 * @return Book选择详情对象集合
	 */
	 Book getbookdetail(Integer id);
		// TODO Auto-generated method stub
		
	/**
	 * 添加商品
	 * @param Book 用户对象
	 * */
	void addBook(Book book);
	
}
