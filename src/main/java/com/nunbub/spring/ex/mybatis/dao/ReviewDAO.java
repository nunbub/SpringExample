package com.nunbub.spring.ex.mybatis.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.nunbub.spring.ex.mybatis.model.Review;

@Repository
public interface ReviewDAO {

	// 특정 id의 review 테이블 조회 결과 리턴
	public Review selectReview(@Param("id") int id);
}
