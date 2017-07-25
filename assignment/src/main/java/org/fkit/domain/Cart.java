package org.fkit.domain;

import java.io.Serializable;
import java.util.List;


public class Cart implements Serializable{
	
	private Integer id;				//id
	private List<Book> book;
	private Integer book_id;			// book_id
	private Integer bookname;
	private Double price;			// 价格
	private Integer count;	//购买数量
	private String state;		//状态
	private String image;
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<Book> getBook() {
		return book;
	}
	public void setBook(List<Book> book) {
		this.book = book;
	}
	public Integer getBook_id() {
		return book_id;
	}
	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}
	
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Cart [book_id=" + book_id + ",bookname=" + bookname + ",count=" + count + ", price=" + price + ""
				+ "id=" + id + ", book=" + book + ",state=" + state + ",image= " + image + "]";
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Integer getBookname() {
		return bookname;
	}
	public void setBookname(Integer bookname) {
		this.bookname = bookname;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
