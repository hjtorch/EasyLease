package com.easylease.TestJersey2.Dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.easylease.TestJersey2.Mapper.PartyMapper;
import com.easylease.TestJersey2.Model.Party;

public class PartyDao {
	private SqlSessionFactory sqlSessionFactory = null;
	public PartyDao() throws IOException{
		String resource = "Mybatis/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	public List<Party> getAllParties(){
		SqlSession session = sqlSessionFactory.openSession();
		try {
			PartyMapper mapper = session.getMapper(PartyMapper.class);
		  return mapper.getAllParties();
		} finally {
		  session.close();
		}
	}
	
	public void createParty(Party party){
		SqlSession session = sqlSessionFactory.openSession();
		try {
			PartyMapper mapper = session.getMapper(PartyMapper.class);
		  mapper.createParty(party);
		} finally {
		  session.close();
		}
	}
}
