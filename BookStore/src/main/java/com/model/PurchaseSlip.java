package com.model;

import java.sql.Date;

public class PurchaseSlip {
	private int userid;
	private int bookid;
	private Date date;
	
	public PurchaseSlip(int userid, int bookid, Date date) {
		super();
		this.userid = userid;
		this.bookid = bookid;
		this.date = date;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "PurchaseHistory [userid=" + userid + ", bookid=" + bookid + ", date=" + date + "]";
	}
}