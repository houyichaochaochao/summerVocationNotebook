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
	//  表述一对多的关联关系 press 是 1 
	//这个press 要传到book.xml 文件中，用来定位属性名字的，这里用什么名字
	// .xml 映射配置文件中就要用什么名字
	private Press press;
	//  表述多对多的关联关系 	  
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
	
	
	/**
	 * 没有多对多构造方法因为我们的presses数据库中没有authors
	 * @param id
	 * @param name
	 * @param isbn
	 * @param press
	 */
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
		//防止press和books无限toString
		return "Book [id=" + id + ", name=" + name + ", isbn=" + isbn + ", press=" + press.getName() + ", authors=" + authors.size()
				+ "]";
	}
	 
	
}
