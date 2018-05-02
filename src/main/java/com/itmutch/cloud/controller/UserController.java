package com.itmutch.cloud.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itmutch.cloud.entity.User;
import com.itmutch.cloud.repository.UserRepository;

@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/getAll")
	public List<User> getAll() {
		return this.userRepository.findAll();
	}
	
	@RequestMapping("/user/{id}")
	public User findById(@PathVariable Long id) {
		return userRepository.getOne(id);
	}

}
