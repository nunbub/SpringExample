package com.nunbub.spring.ex.ajax.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nunbub.spring.ex.ajax.dao.NewUserDAO;
import com.nunbub.spring.ex.jsp.model.User;

@Service
public class NewUserBO {
	
	@Autowired
	private NewUserDAO newUserDAO;
	
	public List<User> getUserList(){
		
		return newUserDAO.selectUserList();
		
	}
	
	public int addUser(String name, String birthDay, String email) {
		return newUserDAO.insertUser(name, birthDay, email);
	}
	
	// email 중복 여부 알려주는 기능
	public boolean isDuplicateEamil(String email) {
		
		int count = newUserDAO.selectCountEmail(email);
		
		if(count == 0) {
			return false;
		}else {
			return true;
		}
	}

}
