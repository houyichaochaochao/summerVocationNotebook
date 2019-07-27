package com.test.ssm.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.test.ssm.domain.po.User;

public class TestUserDao {
	public static void main(String[] args) throws IOException {
		String resource = "mybatis-config.xml";
		Reader reader = Resources.getResourceAsReader(
				TestUserDao.class.getClassLoader(), resource
				);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sessionFactory.openSession();
		UserDao userDao = session.getMapper(UserDao.class);
		
//		User user = userDao.findById(2);
//		System.out.println(user);
		List<User> users = userDao.findByName("zhang");
		for (User user : users)
			System.out.println(user);
	}
}
