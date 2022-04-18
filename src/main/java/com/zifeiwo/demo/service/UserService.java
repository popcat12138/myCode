package com.zifeiwo.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zifeiwo.demo.entity.User;
import com.zifeiwo.demo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	public User addUser(User user) {
		return userRepository.save(user);
	}
}
