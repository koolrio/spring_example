package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/ex01")
@RestController // @Controller + @ResponseBody
public class Lesson01Ex01RestController {
	
	// http://localhost:8080/lesson01/ex01/3
	@RequestMapping("/3")
	public String ex01_3() {
		return "<h3>By using @RestController, return String</h3>";
	}
	
	// http://localhost:8080/lesson01/ex01/4
	@RequestMapping("/4")
	public Map<String, String> ex01_4() {
		Map<String, String> map = new HashMap<>();
		map.put("aaa", "ZZZ");
		map.put("bbb", "ZZZ");
		map.put("ccc", "QQQ");
		return map;
	}
	
	@RequestMapping("/5")
	public Data ex01_5() {
		Data data = new Data();
		data.setId(1);
		data.setName("이정현");
		
		return data; // object -> JSON String;
	}
	
	// http://localhost:8080/lesson01/ex01/6
	@RequestMapping("/6")
	public ResponseEntity<Data> ex01_6() {
		Data data = new Data();
		data.setId(100);
		data.setName("신승훈");
		
		return new ResponseEntity<>(data, HttpStatus.CREATED);
		
	}
}
