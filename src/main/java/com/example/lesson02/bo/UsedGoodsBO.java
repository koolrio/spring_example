package com.example.lesson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson02.domain.UsedGoods;
import com.example.lesson02.mapper.UsedGoodsMapper;

@Service	// Spring bean registration
public class UsedGoodsBO {
	@Autowired //Dependency Injection (DI)
	private UsedGoodsMapper usedGoodsMapper;
	
	// input: x received from controller
	//output: give to controller List<UsedGoods?\>
	
	public List<UsedGoods> getUsedGoodsList() {
		List<UsedGoods> usedGoodsList = usedGoodsMapper.selectUsedGoodsList(); ;
		return usedGoodsList;// return to controller
	}
}
