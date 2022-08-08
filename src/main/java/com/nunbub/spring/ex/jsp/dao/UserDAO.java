package com.nunbub.spring.ex.jsp.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO {

	public int insertUser(
			@Param("name") String name
			, @Param("birthDay") String birthday
			, @Param("introduce") String introduce
			, @Param("email") String email);
	
}
