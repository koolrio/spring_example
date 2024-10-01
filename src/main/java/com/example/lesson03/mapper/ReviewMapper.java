package com.example.lesson03.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.lesson03.domain.Review;

@Mapper
public interface ReviewMapper {

	// input: x
	// output: Review 단건 or 없으면 null
	public Review selectReviewById(int id);
	
	//input: Review
	//output: int(number of proceed line) => Mybatis will respond number of succeed lines 
	public int insertReview(Review review);
	
	//input: parameters
	//output: int(number of proceed line) 
	public int insertReviewAsField(
			@Param("storeId") int storeId, 
			@Param("menu") String menu, 
			@Param("userName") String userName, 
			@Param("point") Double point, 
			@Param("review") String review);
}
