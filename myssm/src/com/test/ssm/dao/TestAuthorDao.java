package com.test.ssm.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.UUID;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.test.ssm.domain.po.Author;

public class TestAuthorDao {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//加载配置文件
		String resource = "mybatis-config.xml";
		Reader reader = Resources.getResourceAsReader(TestAuthorDao.class.getClassLoader(), resource);
		// 生成会话工厂
		SqlSessionFactory sessionFactory =  new SqlSessionFactoryBuilder().build(reader);
		//生成会话
		SqlSession session = sessionFactory.openSession();

		//下面正式开始写,借助session,使用接口绑定的方式实现数据库的操作CRUD
		AuthorDao authorDao = session.getMapper(AuthorDao.class);
		
//		Author author = new Author("李世民","男");
		
		//这里记住只有实例化才有能执行的方法,上面的映射也可以叫实例化
//		int result = authorDao.insert(author);
//		System.out.println(result);
		// 这里注意传的list属于不同的包都会出问题，一般选择java.util
		
		
//		author.setGender("女");
//		int result2= authorDao.update(author);
//		System.out.println(authorDao.findById(6));
//		authorDao.delete(7);
		List<Author> authors = authorDao.findAll();
		for (Author author3 : authors) {
			System.out.println(author3);
		}	
		// 经过以上测试，曾删改查没有问题
		/**
		 * 注意这里如果没有提交的话，是只存在于会话中，但是并没有
		 * 持久话，只有提交以后才算完成，这个和git中的版本控制有着
		 * 异曲同工之妙,可以通过查看源码，了解
		 */
		//测试GUID
//		System.out.println(UUID.randomUUID());
		session.commit();
		session.close();
	}

}
