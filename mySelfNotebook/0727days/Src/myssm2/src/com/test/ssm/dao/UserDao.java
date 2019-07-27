package com.test.ssm.dao;

import java.util.List;

import com.test.ssm.domain.po.User;

public interface UserDao {
	User findById(Integer id);
	List<User> findAll();
	List<User> findByName(String name);	// Ä£ºý²éÑ¯
}
