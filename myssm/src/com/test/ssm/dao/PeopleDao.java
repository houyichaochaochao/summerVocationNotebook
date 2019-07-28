package com.test.ssm.dao;

import java.util.List;

import com.test.ssm.domain.po.People;

public interface PeopleDao {
	People findById(Integer id);
	List<People> findAll();
	
	int insert(People people);
	int update(People people);
	int delete(int id);
}
