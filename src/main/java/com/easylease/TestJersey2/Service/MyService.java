package com.easylease.TestJersey2.Service;
import com.easylease.TestJersey2.Model.User;
import java.io.IOException;

import org.springframework.transaction.annotation.Transactional;

import com.easylease.TestJersey2.Dao.UserDao;
import com.easylease.TestJersey2.Model.User;

public class MyService {

	@Transactional
	public User getUsernameById(int id){
    	UserDao dao = null;
    	try {
			dao = new UserDao();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	//return "Hello World";
    	String username = dao.getUserById(id);
    	User user = new User();
    	user.id = (long) id;
    	user.name = username;
    	return user;
	}
}
