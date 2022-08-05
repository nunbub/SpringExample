package com.nunbub.spring.ex.mybatis.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nunbub.spring.ex.mybatis.dao.ReviewDAO;
import com.nunbub.spring.ex.mybatis.model.Review;

@Service
public class ReviewBO {
	
	@Autowired
	private ReviewDAO reviewDAO;
	
	// 특정 id의 review 얻어와서 리턴
	public Review getReview(int id) {
		Review review = reviewDAO.selectReview(id);
		return review;
	}

	// 가게 id, 메뉴, 사용자이름, 별점, 리뷰내용 전달 받아서 저장
	public int addReview(int storeId, String menu, String userName, double point, String review) {
		return reviewDAO.insertReview(storeId, menu, userName, point, review);
	}
	
	// 리뷰 정보를 객체로 전달 받아서 저장
	public int addReviewByObject(Review review) {
		
		return reviewDAO.insertReviewByObject(review);
		
	}
}