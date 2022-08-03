package com.nunbub.spring.ex.database.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.nunbub.spring.ex.database.model.UsedGoods;

@Repository
public interface UsedGoodsDAO {

	// used goods의 모든 행을 조회하는 기능
	public List<UsedGoods> selectUsedGoodsList();
	
}
