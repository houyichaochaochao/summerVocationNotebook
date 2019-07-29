package com.test.ssm.domain.po;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Passport implements Serializable{
	private Integer id;
	private String serialno;
	private int expire;
	// 表述一对一的关联关系
//	private People people;
	private Customer customer;
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
	public Passport() {
		super();
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
