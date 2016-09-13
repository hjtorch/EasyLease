package com.easylease.TestJersey2.Dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.easylease.TestJersey2.Mapper.ItemMapper;
import com.easylease.TestJersey2.Model.Item;

public class ItemDao {
	private SqlSessionFactory sqlSessionFactory = null;
	public ItemDao() throws IOException{
		String resource = "Mybatis/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	public List<Item> getAllItems(){
		SqlSession session = sqlSessionFactory.openSession();
		try {
			ItemMapper mapper = session.getMapper(ItemMapper.class);
		  return mapper.getAllItems();
		} finally {
		  session.close();
		}
	}
}
