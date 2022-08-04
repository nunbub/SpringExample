package com.nunbub.spring.ex.database.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nunbub.spring.ex.database.dao.UsedGoodsDAO;
import com.nunbub.spring.ex.database.model.UsedGoods;

// 전달 받은 데이터를 조작하거나 처리하고, 리턴 받은 데이터를 조작 처리하는 과정 ( = 로직 )
@Service
public class UsedGoodsBO {
	
	// 스프링이 객체를 생성해줌
	@Autowired	
	private UsedGoodsDAO usedGoodsDAO;

	// usedGoods 테이블의 모든 행 정보 가져오는 메소드
	public List<UsedGoods> getUsedGoodsList() {
		
		List<UsedGoods> usedGoodsList = usedGoodsDAO.selectUsedGoodsList();
		return usedGoodsList;
	}
	
}
