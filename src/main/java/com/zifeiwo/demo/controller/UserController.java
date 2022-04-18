package com.zifeiwo.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zifeiwo.demo.entity.User;
import com.zifeiwo.demo.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService service;

	@GetMapping("/addUser")
	public String addUser() {
		return "addUser";
	}
	@PostMapping("/addUser")
	public String addUser(User user) {
		service.addUser(user);
		return "result";
	}
	
}
