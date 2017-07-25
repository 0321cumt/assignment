package org.fkit.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * CREATE TABLE book (
	id INT (11) PRIMARY KEY AUTO_INCREMENT,
	book_id INT (11),
	book_name VARCHAR (20),
	author VARCHAR (54),
	price DOUBLE ,
	remark VARCHAR (500),
	inventory VARCHAR (50),
	image VARCHAR (500),
	image_a VARCHAR (500),
	image_b VARCHAR (255),
	booktypeid VARCHAR (20),
);
 * */
public class Book implements Serializable{
	
	private Integer id;						//ID
	private Integer book_id;				// book_id	
	private String book_name;			// 书名
	private String author;			// 作者
	private Double price;			// 价格
	private String remark;			//描述
	private String inventory;		//库存
	private String image;		// 图片
	private String image_a;		// 图片a
	private String image_b;		// 图片b
	private Integer booktypeid;	//图书类别
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getBook_id() {
		return book_id;
	}
	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getImage_a() {
		return image_a;
	}
	public void setImage_a(String image_a) {
		this.image_a = image_a;
	}
	public String getImage_b() {
		return image_b;
	}
	public void setImage_b(String image_b) {
		this.image_b = image_b;
	}
	public Integer getBooktypeid() {
		return booktypeid;
	}
	public void setBooktypeid(Integer booktypeid) {
		this.booktypeid = booktypeid;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ",book_id=" + book_id + ", book_name=" + book_name + ", author=" + author
				+ ", price=" + price + ", remark=" + remark + ", inventory=" + inventory + ","
						+ " image=" + image +",image_a=" + image_a +",image_b=" + image_b +","
								+ "]";
	}
	
	public String getInventory() {
		return inventory;
	}
	public void setInventory(String inventory) {
		this.inventory = inventory;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	
	
	
	
	

}
