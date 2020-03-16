package com.example.Demo2.controller;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo2.entity.User;
import com.example.Demo2.service.Service;

@RestController
@RequestMapping(value = "controller")
public class UserController {

	private final Logger LOG = LoggerFactory.getLogger(getClass());
	@Autowired
	private Service service;

	
	//@RequestMapping(value = "get", method = RequestMethod.GET)
	@GetMapping("get")
	public List<User> getAllUsers() {
		LOG.info("Getting all users.");
		return service.getAllUsers();
	}
	@RequestMapping(value = "post", method = RequestMethod.POST)
	public User addUser(@RequestBody User user) {
		LOG.info("Adding user.");
		return service.addNewUser(user);
	}
}