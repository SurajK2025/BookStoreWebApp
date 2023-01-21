package com.dao;

public interface CartDao {
	public void addToCart(int userid, int bookid);
	
	public void removeFromCart(int userid, int bookid);
	
	public double totalCartAmount();
}