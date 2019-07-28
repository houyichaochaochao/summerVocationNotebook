package com.test.ssm.dao;

import java.util.List;

import com.test.ssm.domain.po.Press;

public interface PressDao {
	Press findById(Integer id);
	List<Press> findAll();
	
	int insert(Press press);
	int update(Press press);
	int delete(int  id);
}

