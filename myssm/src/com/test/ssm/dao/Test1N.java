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
		/**
		 * 前四句是套路
		 */
		String resource = "mybatis-config.xml";
		Reader reader = Resources.getResourceAsReader(
				Test1N.class.getClassLoader(), resource
				);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sessionFactory.openSession();
//		PressDao pressDao = session.getMapper(PressDao.class);
//		Press press = pressDao.findById(1);
		//这里只是返回的书的个数，由这个出版社出版的总个数
		//这样写的话就是调用了toString函数
//		System.out.println(press);
		BookDao bookDao = session.getMapper(BookDao.class);
		List<Book> books = bookDao.findAll();
		PressDao pressDao = session.getMapper(PressDao.class);
		List<Press> presses = pressDao.findAll();
		System.out.println("所有的书籍"+books);
		System.out.println("所有的出版社"+presses);
	}
}
