package com.test.ssm.dao;

import java.util.List;

import com.test.ssm.domain.po.Author;
import com.test.ssm.domain.po.Book;

public interface BookAndAuthorDao {
	
	List<Book> findAllBooks();
	List<Author> findAllAuthors();

}
