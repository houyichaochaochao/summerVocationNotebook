package com.test.ssm.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.test.ssm.domain.po.Passport;

public class TestPassportDao {
	public static void main(String[] args) throws IOException {
		String resource = "mybatis-config.xml";
		Reader reader = Resources.getResourceAsReader(
				TestPassportDao.class.getClassLoader(), resource
				);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sessionFactory.openSession();
		
		PassportDao passportDao = session.getMapper(PassportDao.class);
		List<Passport> passports = passportDao.findAll();
		for (Passport passport : passports)
			System.out.println(passport);
	}
}
