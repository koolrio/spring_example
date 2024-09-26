package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class Lesson01Ex02Controller {
	//http://localhost/lesson01/ex02
	@RequestMapping("/lesson01/ex02")
	public String ex02() {
		// return되는 String은 HTML의 경로
		// @ResponseBody가 없어야 한다
		
		//     /templates/lesson01/ex02	.html
		return "lesson01/ex02"; //response, html view경로
	}
}
