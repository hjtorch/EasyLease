package com.easylease.TestJersey2.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.easylease.TestJersey2.Model.User;

public interface  UserMapper {
	  @Select("SELECT username FROM user WHERE id = #{id}")
	  String getUserById(int id);
	  
	  @Select("SELECT * FROM user")
	  List<User> getAllUsers();
}

