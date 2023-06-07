package com.cognizant.onetoone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.onetoone.bean.User;
import com.cognizant.onetoone.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public void saveUser(User user) {
		userRepository.saveAndFlush(user);
	}
	
}
