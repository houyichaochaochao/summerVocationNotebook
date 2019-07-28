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

public class TestBookAndPressDao {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String resource ="mybatis-config.xml";
		Reader reader = Resources.getResourceAsReader(TestBookAndPressDao.class.getClassLoader(), resource);
		
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sessionFactory.openSession();	
		//这一步是建立映射
		PressDao pressDao = session.getMapper(PressDao.class);
		BookDao bookDao = session.getMapper(BookDao.class);
//		Press press = new Press("东林","北京路");
//		pressDao.insert(press);
		pressDao.delete(12);
		Press press = new Press (7,"上市","天津");
		pressDao.update(press);
		List<Press> presses = pressDao.findAll();
		for (Press press1 : presses  ) {
			// 因为这里是打印字符串，而我的字符串设置是打印的
			//时候，只打印出版社的名字
			System.out.println(press1);
		}
//		Book book = new Book("的子","1e3dd23123ddsdradr3", press);
//		int result = bookDao.insert(book);
		bookDao.delete(5);
		Press press5= pressDao.findById(9);
		// 这里的press5 不要和book.xml 里面的属性保持一致，顺序一样就行
		// 因为我们的update中是按照你的po持久化对象的属性名称保持一致
		Book book = new Book(9,"猴子","sdfaii",press5);
		bookDao.update(book);
		List<Book> books = bookDao.findAll();		
		for (Book book2 : books) {
			System.out.println(book2);
		}

		
		session.commit();
		session.close();

	}

}
