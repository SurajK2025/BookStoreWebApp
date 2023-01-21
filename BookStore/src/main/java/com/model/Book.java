package com.model;

public class Book {
	private int bookid;
	private String booktitle;
	private String author;
	private double price;
	
	public Book(String booktitle, String author, double price) {
		super();
		this.booktitle = booktitle;
		this.author = author;
		this.price = price;
	}
	
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBooktitle() {
		return booktitle;
	}
	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", booktitle=" + booktitle + ", author=" + author + ", price=" + price + "]";
	}
}
