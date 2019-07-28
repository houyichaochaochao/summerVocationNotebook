package com.test.ssm.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.test.ssm.domain.po.Passport;
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
		PassportDao passportDao = session.getMapper(PassportDao.class);
		
//		People people = peopleDao.findById(1);
//		System.out.println(people);
		Passport passport = passportDao.findById(17);	
		//这个passport选出来后会交给唯一的一个人
		People people2 = new People("liyang",passport);
		peopleDao.insert(people2);
		peopleDao.delete(6);
		People people3 = peopleDao.findById(3);
		people3.setName("huge");
		peopleDao.update(people3);
		List<People> peoples = peopleDao.findAll();
		for (People people4 : peoples) {
			System.out.println(people4);
		}
		
		
		
		session.commit();
		session.close();
	}

}
