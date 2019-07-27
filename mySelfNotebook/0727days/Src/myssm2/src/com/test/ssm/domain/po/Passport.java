package com.test.ssm.domain.po;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Passport implements Serializable{
	private Integer id;
	private String serialno;
	private int expire;
	// 表述一对一的关联关系
	private People people;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSerialno() {
		return serialno;
	}
	public void setSerialno(String serialno) {
		this.serialno = serialno;
	}
	public int getExpire() {
		return expire;
	}
	public void setExpire(int expire) {
		this.expire = expire;
	}
	public People getPeople() {
		return people;
	}
	public void setPeople(People people) {
		this.people = people;
	}
	public Passport() {
		super();
	}
	public Passport(Integer id, String serialno, int expire, People people) {
		super();
		this.id = id;
		this.serialno = serialno;
		this.expire = expire;
		this.people = people;
	}
	public Passport(Integer id, String serialno, int expire) {
		super();
		this.id = id;
		this.serialno = serialno;
		this.expire = expire;
	}
	public Passport(String serialno, int expire) {
		super();
		this.serialno = serialno;
		this.expire = expire;
	}
	@Override
	public String toString() {
		return "Passport [id=" + id + ", serialno=" + serialno + ", expire=" + expire + ", people=" + people.getName() + "]";
	}
	
}
