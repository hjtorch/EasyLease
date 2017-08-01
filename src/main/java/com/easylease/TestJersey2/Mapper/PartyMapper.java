package com.easylease.TestJersey2.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.easylease.TestJersey2.Model.Party;

public interface PartyMapper {
	  @Select("SELECT * FROM party")
	  public List<Party> getAllParties();
	  
	  @Insert("insert into party (owner, owner_thumbnail, title, date, time) values (#{owner}, #{owner_thumbnail}, #{title}, CURDATE(), CURTIME())")
	  public int createParty(Party party);
}
