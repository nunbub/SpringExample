package com.nunbub.spring.ex.jsp.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nunbub.spring.ex.jsp.dao.UserDAO;
import com.nunbub.spring.ex.jsp.model.User;

@Service
public class UserBO {
	
	@Autowired
	private UserDAO userDAO;
	
	// new_user 데이터 저장
	// 이름, 생년월일, 자기소개, 이메일
	public int addUser(String name, String birthday, String introduce, String email) {
		return userDAO.insertUser(name, birthday, introduce, email);
	}
	
	// 최근 등록된 사용자 가져오기
	public User getLastUser() {
		
		return userDAO.selectLastUser();
	}

}
