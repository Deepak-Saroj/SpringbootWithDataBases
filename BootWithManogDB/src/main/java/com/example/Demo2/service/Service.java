package com.example.Demo2.service;
import java.util.List;

import com.example.Demo2.entity.User;
public interface Service {

	List<User> getAllUsers();

	User getUserById(String userId);

	User addNewUser(User user);
}