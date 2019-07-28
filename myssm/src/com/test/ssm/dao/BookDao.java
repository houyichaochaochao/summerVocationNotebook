package com.test.ssm.dao;

import java.util.List;

import com.test.ssm.domain.po.Book;

public interface BookDao {
	Book findById(Integer id);
	List<Book> findAll();
	// 新增 插入，更改 ，删除
	int insert(Book book);
	int update(Book book);
	int delete(int id);
}
