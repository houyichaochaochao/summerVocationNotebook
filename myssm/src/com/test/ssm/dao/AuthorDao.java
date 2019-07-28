package com.test.ssm.dao;

import java.util.List;

import com.test.ssm.domain.po.Author;

public interface AuthorDao {
	Author findById(Integer id);
	List<Author> findAll();
	int insert(Author author);
	int update(Author author);
	int delete(Integer id);
	//这里本来没有补充，其实没有必要每个属性比对才删除 
	//时间原因我先试着完成上面的三种CRUD
	int delete(Author author);
}
