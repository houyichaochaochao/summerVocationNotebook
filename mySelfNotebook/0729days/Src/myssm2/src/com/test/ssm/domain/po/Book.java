package com.test.ssm.domain.po;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("serial")
public class Book implements Serializable{
	private Integer id;
	private String name;
	private String isbn;
	//private Integer pressId;
	// 表述一对多的关联关系
	private Press press;
	// 表述多对多的关联关系
	private Set<Author> authors = new HashSet<Author>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Press getPress() {
		return press;
	}
	public void setPress(Press press) {
		this.press = press;
	}
	public Set<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}
	public Book() {
		super();
	}
	public Book(Integer id, String name, String isbn, Press press, Set<Author> authors) {
		super();
		this.id = id;
		this.name = name;
		this.isbn = isbn;
		this.press = press;
		this.authors = authors;
	}
	public Book(Integer id, String name, String isbn, Press press) {
		super();
		this.id = id;
		this.name = name;
		this.isbn = isbn;
		this.press = press;
	}
	public Book(String name, String isbn, Press press) {
		super();
		this.name = name;
		this.isbn = isbn;
		this.press = press;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", isbn=" + isbn + ", press=" + press.getName() + ", authors=" + authors.size()
				+ "]";
	}
	

}
