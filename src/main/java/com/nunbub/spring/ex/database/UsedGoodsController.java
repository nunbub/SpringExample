package com.nunbub.spring.ex.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nunbub.spring.ex.database.bo.UsedGoodsBO;
import com.nunbub.spring.ex.database.model.UsedGoods;

// request를 전달 받고, response를 만드는 일
@Controller
public class UsedGoodsController {
	
	@Autowired
	private UsedGoodsBO usedGoodsBO;

	@RequestMapping("/database/ex01")
	@ResponseBody
	public List<UsedGoods> ex01() {
		
		List<UsedGoods> usedGoodsList = usedGoodsBO.getUsedGoodsList();
		return usedGoodsList;
	}
	
}
