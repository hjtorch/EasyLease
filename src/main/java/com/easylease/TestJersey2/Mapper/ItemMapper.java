package com.easylease.TestJersey2.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import com.easylease.TestJersey2.Model.Item;

public interface ItemMapper {
	  @Select("SELECT * FROM items")
	  List<Item> getAllItems();
}
