package com.example.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.lesson04.bo.UserBO;

@RequestMapping("/lesson04/ex01")
@Controller //HTML paths, no @Responsed\Body
public class Lesson04Ex01Controller {

	@Autowired
	private UserBO userBO;
	// Membership display
	// http://localhost/lesson04/ex01/add-user-view
	@RequestMapping(path = "/add-user-view", method = RequestMethod.GET)
	public String addUserView() {
		return "lesson04/addUser"; //HTML paths
	}
	
	// insert DB into the member data => transfer to result screen
	@PostMapping("/add-user")
	public String addUser(
			
			@RequestParam("name") String name,
			@RequestParam("yyyymmdd") String yyyymmdd, 
			@RequestParam("email") String email, 
			@RequestParam(value = "introduce", required=false) String introduce) {
		
				
		//DB insertion
		userBO.addUser(name, yyyymmdd, email, introduce);
				
		// result display transfer
		
		return "lesson04/afterAddUser";
	}
}
