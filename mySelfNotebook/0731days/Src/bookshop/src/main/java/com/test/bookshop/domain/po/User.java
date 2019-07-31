package com.test.bookshop.domain.po;

import java.io.Serializable;
import java.sql.Date;

@SuppressWarnings("serial")
public class User implements Serializable{
	
	private Integer id;
	private String usn;
	private String pwd;
	private int age;
	private Date birthday;
	private double salary;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsn() {
		return usn;
	}
	public void setUsn(String usn) {
		this.usn = usn;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", usn=" + usn + ", pwd=" + pwd + ", age=" + age + ", birthday=" + birthday
				+ ", salary=" + salary + "]";
	}

}
