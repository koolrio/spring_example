package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.bo.ReviewBO;
import com.example.lesson03.domain.Review;

@RequestMapping("/lesson03/ex02")
@RestController
public class Lesson03Ex02RestController {

	@Autowired
	private ReviewBO reviewBO;
	@RequestMapping("/1")
	public String ex02_1() {
		Review review = new Review();
		review.setStoreId(7);
		review.setMenu("삼겹혼밥세트");
		review.setUserName("이정현");
		review.setPoint(5.0);
		review.setReview("괜찮은 맛이내요");
		
		int rowCount = reviewBO.addReview(review);
		return "succeed row count: " + rowCount;
	}
	
	@RequestMapping("/2")
	public String ex02_2() {
		int rowCount = reviewBO.addReviewAsField(4, "콤비네이션 레귤러", "이정재", 4.5, "휴일에 먹기 적당하내요");
		
		return "succeed row count: " + rowCount;	
	}
}
