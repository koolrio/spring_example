package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson01/ex01") // class' path firstly be read
@Controller //Spring bean registration
public class Lesson01Ex01Controller {
	
	// http://localhost:8080/lesson01/ex01/1
	// String to be printed in the browser
	@ResponseBody// Returning String to be inserted to Response body and HTML is responding
	@RequestMapping("/1")
	
	public String ex01_1() {
		return "<h2>Character row to be sent to ResponseBody Example</h2>";
	}
	
	// http://localhost:8080/lesson01/ex01/2
	// map to be returned => JSON String
	
	@RequestMapping("/2")
	public @ResponseBody Map<String, Object> ex01_2() {
		Map<String, Object> map = new HashMap<>();
		map.put("Strawberry", 3);
		map.put("Pineapple", 20);
		map.put("Grape", 51);
		//if map was returned JSON String will be created
		//as of that inside the web starter, jackson library exist
		return map;
	}
	// http://localhost:8080/lesson01/quiz02/2
//		@RequestMapping("/3")
//		public ResponseEntity <Board> quiz02_3 () {
//			Board board = new Board();
//			board.setTitle("안녕하세요 가입인사 드립니다.");
//			board.setUser("marobina");
//			board.setContent("안녕하세요. 가입했어요. 앞으로 장 부탁드립니다.");
//
//			return new ResponseEntity<>(board, HttpStatus.INTERNAL_SERVER_ERROR);
//		}
}
