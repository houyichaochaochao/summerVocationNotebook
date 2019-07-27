package com.test.ssm.dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.test.ssm.domain.po.Author;
import com.test.ssm.domain.po.Book;

public class TestMN {

	public static void main(String[] args) throws IOException {
		String resource = "mybatis-config.xml";
		Reader reader = Resources.getResourceAsReader(
				TestMN.class.getClassLoader(), resource
				);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sessionFactory.openSession();
		
//		AuthorDao authorDao = session.getMapper(AuthorDao.class);
//		Author author = authorDao.findById(1);
//		System.out.println(author);
		
		BookDao bookDao = session.getMapper(BookDao.class);
		Book book = bookDao.findById(1);
		System.out.println(book);

	}

}
