package com.test.ssm.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.test.ssm.domain.po.Book;
import com.test.ssm.domain.po.Press;

public class Test1N {
	public static void main(String[] args) throws IOException {
		String resource = "mybatis-config.xml";
		Reader reader = Resources.getResourceAsReader(
				Test1N.class.getClassLoader(), resource
				);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sessionFactory.openSession();
		
//		PressDao pressDao = session.getMapper(PressDao.class);
//		Press press = pressDao.findById(1);
//		System.out.println(press);
		BookDao bookDao = session.getMapper(BookDao.class);
		Book book = bookDao.findById(1);
		System.out.println(book);
	}
}
