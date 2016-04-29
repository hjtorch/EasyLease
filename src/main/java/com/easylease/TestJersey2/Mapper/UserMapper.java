package com.easylease.TestJersey2.Mapper;

import org.apache.ibatis.annotations.Select;

public interface  UserMapper {
	  @Select("SELECT username FROM users WHERE id = #{id}")
	  String getUserById(int id);
}
