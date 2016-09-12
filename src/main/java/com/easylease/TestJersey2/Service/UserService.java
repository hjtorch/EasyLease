package com.easylease.TestJersey2.Service;

import java.io.IOException;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.easylease.TestJersey2.Dao.UserDao;
import com.easylease.TestJersey2.Model.User;

public class UserService {
	@Transactional
	public List<User> getAllUsers(){
    	UserDao dao = null;
    	try {
			dao = new UserDao();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return dao.getAllUsers();
	}
}
