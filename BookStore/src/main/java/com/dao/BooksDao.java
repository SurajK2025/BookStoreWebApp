package com.dao;

import java.util.List;
import com.model.Book;

public interface BooksDao {
	public List<Book> getBooks();
	
	public void insertBook(Book book);
	
	public void updateBook(int bookid, Book book);
	
	public Book getBook();
	
	public void deleteBook(int bookid);
}