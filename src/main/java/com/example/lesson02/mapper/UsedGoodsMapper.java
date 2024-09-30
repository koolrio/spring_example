package com.example.lesson02.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.lesson02.domain.UsedGoods;

@Mapper
public interface UsedGoodsMapper {

	//input: received form BO. X
	// output: send to BO. List<UsedGoods>
	
	
	public List<UsedGoods> selectUsedGoodsList();
}
	