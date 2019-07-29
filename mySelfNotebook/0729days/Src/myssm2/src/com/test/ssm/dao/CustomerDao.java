package com.test.ssm.dao;

import java.util.List;

import com.test.ssm.domain.po.Customer;

public interface CustomerDao {
	Customer findById(Integer id);
	List<Customer> findAll();
}
