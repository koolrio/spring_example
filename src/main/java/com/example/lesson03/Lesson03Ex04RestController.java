package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.bo.ReviewBO;
@RestController
public class Lesson03Ex04RestController {
	@Autowired
	private ReviewBO reviewBO;
	
	@RequestMapping("/lesson03/ex04")
	public String ex04(
			@RequestParam("id")int id
			) {
		reviewBO.deleteReviewById(id);
		return "Deletion success";
	}
	
}
