package com.test.ssm.dao;

import java.util.List;

import com.test.ssm.domain.po.Passport;

public interface PassportDao {
	Passport findById(Integer id);
	List<Passport> findAll();
	
	int insert(Passport passport);
	int update(Passport passport);
	int delete(int id);
}
