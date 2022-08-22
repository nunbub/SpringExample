package com.nunbub.spring.ex.ajax.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.nunbub.spring.ex.jsp.model.User;

@Repository
public interface NewUserDAO {

	public List<User> selectUserList();
	
	public int insertUser(
			@Param("name")String name
			, @Param("birthDay")String birthDay
			, @Param("email")String email);
	
	public int selectCountEmail(@Param("email") String email);
}
