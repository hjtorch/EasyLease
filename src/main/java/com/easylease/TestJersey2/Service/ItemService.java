package com.easylease.TestJersey2.Service;

import java.io.IOException;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.easylease.TestJersey2.Dao.ItemDao;
import com.easylease.TestJersey2.Model.Item;

public class ItemService {
	@Transactional
	public List<Item> getAllItems(){
		ItemDao dao = null;
    	try {
			dao = new ItemDao();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return dao.getAllItems();
	}
}
