package com.hcl.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.entity.Login;
import com.hcl.entity.User;
import com.hcl.service.UserService;


@RestController
@CrossOrigin(origins ="http://localhost:4200")
public class UserController {
	@Autowired
	private UserService s1;
	
	
	
	@PostMapping("/signup")

	public User registration(@RequestBody User u) {
		try {
			User response = s1.addUser(u);
			return response;
		} catch (Exception e) {
			return new User();

		}
	}
	
	@PostMapping("/login")
	
	public User login(@RequestBody Login l) {
		
		return s1.loginUser(l.getUsername(),l.getPassword());
		
	}

	@GetMapping("/getUser")
	public List<User> listOfUser() {
		return s1.getAllUser();
	}
}
