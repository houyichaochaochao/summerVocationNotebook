package com.test.ssm.domain.po;

import java.io.Serializable;

@SuppressWarnings("serial")
public class People implements Serializable{
	private Integer id;
	private String name;
	//private Integer passportId; 为了含有一对一的关联关系
	//  描述一对一的关系，这样以后才有关联
	private Passport passport;
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
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	public People() {
		super();
	}
	public People(Integer id, String name, Passport passport) {
		super();
		this.id = id;
		this.name = name;
		this.passport = passport;
	}
	/**
	 * 没有主键的构造方法 
	 * @param name
	 * @param passport
	 */
	public People(String name, Passport passport) {
		super();
		this.name = name;
		this.passport = passport;
	}
	@Override
	public String toString() {
		//因为护照是唯一的，所以这里不用size，只有不是唯一的时候才用size来表示个数
		return "People [id=" + id + ", name=" + name + ", passport=" + passport.getId() + "]";
	}
	
}
