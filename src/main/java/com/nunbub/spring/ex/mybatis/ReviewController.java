package com.nunbub.spring.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nunbub.spring.ex.mybatis.bo.ReviewBO;
import com.nunbub.spring.ex.mybatis.model.Review;

@Controller
@RequestMapping("/mybatis")
public class ReviewController {
	
	@Autowired
	private ReviewBO reviewBO;
	
	// 특정 id의 Review 데이터 가져오기
	@RequestMapping("/ex01")
	@ResponseBody
	public Review review(
//			@RequestParam(value="id", required=true) int id = 풀어쓴 형태
//			@RequestParam("id") int id = 축약된 형태
//			@RequestParam(value="id", required=false) Integer id = 필수 항복이 아닌 파라미터 설정
			@RequestParam(value="id", defaultValue="3") int id) {
//			, @RequestParam("test") String test
		Review review = reviewBO.getReview(id);
		
		return review;
	}
	
	@RequestMapping("/ex02")
	@ResponseBody
	public String addReview() {
		// 가게 id, 메뉴, 사용자이름, 별점, 리뷰내용
//		int count = reviewBO.addReview(4, "콤비네이션피자", "김바다", 4.5, "할인도 많이 받고 잘먹었습니다!!");
		Review review = new Review();
		review.setStoreId(2);
		review.setMenu("뿌링클");
		review.setUserName("김인규");
		review.setPoint(4.0);
		review.setReview("역시 뿌링클은 진리입니다!!");
		int count = reviewBO.addReviewByObject(review);
		
		return "삽입 결과 : " + count;
	}

}
