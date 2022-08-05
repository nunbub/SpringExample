package com.nunbub.spring.ex.mybatis.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.nunbub.spring.ex.mybatis.model.Review;

@Repository
public interface ReviewDAO {
	
	// 특정 id의 review 테이블 조회 결과 리턴
	public Review selectReview(@Param("id") int id);
	
	// 가게 id, 메뉴, 사용자이름, 별점, 리뷰내용 전달 받아서 테이블에 insert
	public int insertReview(
			@Param("storeId") int storeId
			, @Param("menu") String menu
			, @Param("userName") String userName
			, @Param("point") double point
			, @Param("review") String review);

	// 객체를 전달 받아서 리뷰 내용을 insert
	public int insertReviewByObject(Review review);
}
