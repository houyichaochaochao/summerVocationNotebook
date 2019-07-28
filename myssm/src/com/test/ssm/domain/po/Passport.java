package com.test.ssm.domain.po;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Passport implements Serializable{
	private Integer id;
	private String serialno;
	private int expire;
	// 表述一对一的关联关系 ,这是数据库中没有的，是为了双向实现
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
	/**
	 * 实际上所有的实体类你可以只创建缺省无参的构造方法
	 * 那样的话就够用，虽然现在还是不太明白
	 */
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
	/**
	 * 这个是和数据库表对应的方法
	 * @param id
	 * @param serialno
	 * @param expire
	 */
	public Passport(Integer id, String serialno, int expire) {
		super();
		this.id = id;
		this.serialno = serialno;
		this.expire = expire;
	}
	/**
	 * 无主键属性,主要作用是为了向数据库中插入
	 * @param serialno
	 * @param expire
	 */
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
