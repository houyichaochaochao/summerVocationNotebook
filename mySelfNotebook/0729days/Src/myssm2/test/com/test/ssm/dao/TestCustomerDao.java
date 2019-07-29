package com.test.ssm.dao;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.test.ssm.domain.po.Customer;

public class TestCustomerDao {
	private SqlSession session = null;
	private CustomerDao customerDao = null;
	@Before
	public void setup() throws IOException {
		// 在所有的测试方法之前执行一次，完成初始化任务
		String resource = "mybatis-config.xml";
		Reader reader = Resources.getResourceAsReader(
				TestCustomerDao.class.getClassLoader(), resource
				);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		session = sessionFactory.openSession();
		customerDao = session.getMapper(CustomerDao.class);
	}

	@Test
	public void testFindById() {
		Customer customer = customerDao.findById(1);
		assertTrue(customer.getPassport().getId() == 2);
	}
	
	@Test
	public void testFindAll() {
		List<Customer> customers = customerDao.findAll();
		assertTrue(1 == customers.size());;
	}
	
	@After
	public void tear() {
		// 在所有的测试方法执行结束后执行，完成资源的释放
		session.close();
	}

}
