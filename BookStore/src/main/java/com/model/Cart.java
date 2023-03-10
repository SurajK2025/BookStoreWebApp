package com.model;

public class Cart {
	private int userid;
	private int bookid;
	
	public Cart(int userid, int bookid) {
		super();
		this.userid = userid;
		this.bookid = bookid;
	}
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	
	@Override
	public String toString() {
		return "Cart [userid=" + userid + ", bookid=" + bookid + "]";
	}
}
