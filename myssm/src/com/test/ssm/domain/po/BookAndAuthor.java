package com.test.ssm.domain.po;

import java.util.List;

public class BookAndAuthor {
	private int id;
	private int bookid;
	private int authorId;
	
	private List<Book> books;
	private List<Author> authors;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	public BookAndAuthor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookAndAuthor(int id, int bookid, int authorId, List<Book> books, List<Author> authors) {
		super();
		this.id = id;
		this.bookid = bookid;
		this.authorId = authorId;
		this.books = books;
		this.authors = authors;
	}
	public BookAndAuthor(int bookid, int authorId) {
		super();
		this.bookid = bookid;
		this.authorId = authorId;
	}
	public BookAndAuthor(List<Book> books, List<Author> authors) {
		super();
		this.books = books;
		this.authors = authors;
	}
	@Override
	public String toString() {
		return "BookAndAuthor [id=" + id + ", bookid=" + bookid + ", authorId=" + authorId + ", books=" + books.size()
				+ ", authors=" + authors.size() + "]";
	}
	

	
	
	
}
