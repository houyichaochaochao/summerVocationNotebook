package com.test.ssm.domain.po;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("serial")
public class Press implements Serializable{
	private Integer id;
	private String name;
	private String address;
	// 表述一对多的关联关系
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Set<Book> getBooks() {
		return books;
	}
	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	public Press() {
		super();
	}
	public Press(Integer id, String name, String address, Set<Book> books) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.books = books;
	}
	public Press(Integer id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public Press(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Press [id=" + id + ", name=" + name + ", address=" + address + ", books=" + books.size() + "]";
	}
	

}
