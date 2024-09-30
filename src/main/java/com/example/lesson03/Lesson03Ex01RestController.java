package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.bo.ReviewBO;
import com.example.lesson03.domain.Review;

@RestController
public class Lesson03Ex01RestController {
	
	@Autowired
	private ReviewBO reviewBO;
	
	@RequestMapping("/lesson03/ex01")
	public Review ex01(
		
		@RequestParam("id") int id	
		//@RequestParam(value = "id") int id
		//@RequestParam(value = "id", required = true) int id// 필수 파라미터
		//@RequestParam(value = "id", required = false) Integer id
		//@RequestParam(value = "id", defaultValue = "1") int id
			
	) {
//		if(id==null) {
//			id=1;
//		}
		return reviewBO.getReviewById(id);
	}
}
