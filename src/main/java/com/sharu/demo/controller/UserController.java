package com.sharu.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sharu.demo.abs.AbstractController;
import com.sharu.demo.model.ServerResponse;
import com.sharu.demo.model.UserModel;
import com.sharu.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController extends AbstractController<UserController>{
	private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ResponseEntity<ServerResponse> createUser(@RequestBody UserModel userModel){
		try {
			return new ResponseEntity<>(createServerResponse("Sucess", 2000,"Success message",
					userService.createUser(userModel), null), HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(createServerResponse("Failure", 4000, e.getMessage() , null, null), HttpStatus.OK);
		}
	}
}