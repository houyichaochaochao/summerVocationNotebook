package com.test.ssm.dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.test.ssm.domain.po.People;

public class TestPeopleDao {
	public static void main(String[] args) throws IOException {
		String resource = "mybatis-config.xml";
		Reader reader = Resources.getResourceAsReader(
				TestPeopleDao.class.getClassLoader(), resource
				);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sessionFactory.openSession();
		PeopleDao peopleDao = session.getMapper(PeopleDao.class);
		
		People people = peopleDao.findById(1);
		System.out.println(people);
		
	}
}
