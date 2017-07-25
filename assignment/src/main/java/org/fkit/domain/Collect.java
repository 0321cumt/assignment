package org.fkit.domain;

public class Collect{

	

	private int id;
	private int book_id;
	private String book_name;
	private String image;
	private String loginname;
	

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	
	@Override
	public String toString() {
		return "Collect [id=" + id + ",book_name=" + book_name + ""
				+ ",  image=" + image + ",loginname=" + loginname + ",book_id=" + book_id + "]";
	}

	

}