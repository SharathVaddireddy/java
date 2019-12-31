package com.sharu.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharu.demo.model.User;
import com.sharu.demo.model.UserModel;
import com.sharu.demo.repository.UserRepository;
import com.sharu.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;
	
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}



	@Override
	public Boolean createUser(UserModel userModel) {
		User user = new User();
		user.setName(userModel.getName());
		user.setAge(userModel.getAge());
		userRepository.save(user);
		return true;
	}
	
}