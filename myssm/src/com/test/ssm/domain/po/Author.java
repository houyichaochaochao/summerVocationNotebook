package com.test.ssm.domain.po;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("serial")
public class Author implements Serializable{
	private Integer id;
	private String name;
	private String gender;
	// 表述多对多的关联关系
	//因为是一个set 需要用collection来写
	private Set<Book> books = new HashSet<Book>();
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Set<Book> getBooks() {
		return books;
	}
	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	public Author() {
		super();
	}
	public Author(Integer id, String name, String gender, Set<Book> books) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.books = books;
	}
	public Author(Integer id, String name, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	public Author(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", gender=" + gender + ", books=" + books.size() + "]";
	}
	
}
