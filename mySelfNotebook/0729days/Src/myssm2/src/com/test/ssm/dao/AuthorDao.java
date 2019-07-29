package com.test.ssm.dao;

import java.util.List;

import com.test.ssm.domain.po.Author;

public interface AuthorDao {
	Author findById(Integer id);
	List<Author> findAll();
}
