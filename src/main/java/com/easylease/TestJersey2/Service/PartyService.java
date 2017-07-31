package com.easylease.TestJersey2.Service;

import java.io.IOException;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.easylease.TestJersey2.Dao.PartyDao;
import com.easylease.TestJersey2.Model.Party;

public class PartyService {
	@Transactional
	public List<Party> getAllParties(){
		PartyDao dao = null;
    	try {
			dao = new PartyDao();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return dao.getAllParties();
	}
	
	@Transactional
	public void createParty(Party party){
		PartyDao dao = null;
    	try {
			dao = new PartyDao();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	dao.createParty(party);
	}
}
