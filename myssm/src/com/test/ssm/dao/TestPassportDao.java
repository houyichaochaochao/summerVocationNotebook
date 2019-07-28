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
		System.out.println(passports.size());
		for (Passport passport : passports) {
//			System.out.println(passport);
		}
		// 我懂了，因为people表是他的主表，所以这里每添加一个外键是可以的，
		//但是不能随便打印，必须在people中有对应的people才行，这看它本身的
		//toString 方法可以看出来
		Passport passport = new Passport("q33833843333eno",345);
		int result= passportDao.insert(passport);
		System.out.println(result);
		int a= passportDao.delete(13); //没有被引用的就能成功
		System.out.println(a);
		Passport passport2= passportDao.findById(17);
		passport2.setExpire(686);
		int b = passportDao.update(passport2);
		System.out.println(b);

//		List<Passport> passports2 = passportDao.findAll();
//		for (Passport passport2 : passports2) {
//			System.out.println(passport2);
//		}
		session.commit();
		session.close();
	}
}
