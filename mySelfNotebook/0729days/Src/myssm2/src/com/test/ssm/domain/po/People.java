package com.test.ssm.domain.po;

import java.io.Serializable;

@SuppressWarnings("serial")
public class People implements Serializable{
	private Integer id;
	private String name;
	//private Integer passportId;
	// 描述一对一的关联关系
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
	public People(String name, Passport passport) {
		super();
		this.name = name;
		this.passport = passport;
	}
	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + ", passport=" + passport.getId() + "]";
	}
	
}
