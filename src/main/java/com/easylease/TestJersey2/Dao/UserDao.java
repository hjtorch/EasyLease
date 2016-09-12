package com.easylease.TestJersey2.Dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.easylease.TestJersey2.Mapper.UserMapper;
import com.easylease.TestJersey2.Model.User;


public class UserDao {
	
	private SqlSessionFactory sqlSessionFactory = null;
	public UserDao() throws IOException{
		String resource = "Mybatis/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	public String getUserById(int id){
		SqlSession session = sqlSessionFactory.openSession();
		try {
		  UserMapper mapper = session.getMapper(UserMapper.class);
		  return mapper.getUserById(id);
		} finally {
		  session.close();
		}		
	}
	
	public List<User> getAllUsers(){
		SqlSession session = sqlSessionFactory.openSession();
		try {
		  UserMapper mapper = session.getMapper(UserMapper.class);
		  return mapper.getAllUsers();
		} finally {
		  session.close();
		}
	}

}
