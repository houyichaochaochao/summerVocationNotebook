package com.test.ssm.domain.po;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


public class Press implements Serializable{
	private  Integer id;
	private String name;
	private String address; 
	
	// 表述一对多的关联
	//一个包下的公共类可以互相调用,而且不需要引入
	// 只有强调外键才这样
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
	/**
	 *  无参构造方法
	 */
	public Press() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 *	这是全构造 
	 * @param id
	 * @param name
	 * @param address
	 * @param books
	 */
	public Press(Integer id, String name, String address, Set<Book> books) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.books = books;
	}

	/**
	 *	这是没有关联关系的构造 ,这个是符合数据库的方法 
	 * @param id
	 * @param name
	 * @param address
	 */
	public Press(Integer id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	/**
	 * 没有ID 没有关联方法的构造方法是用来插入用的。
	 * @param name
	 * @param address
	 */
	public Press(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		//防止递归调用toString方法，这里我们只关心books.size().这样就足够了
		return "Press [id=" + id + ", name=" + name + ", address=" + address + ", books=" + books.size() + "]";

	}
	
	
	
	
	
	 
	
}