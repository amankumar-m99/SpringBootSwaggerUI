package com.amankumarm99.springbootswaggerui.service;

import org.springframework.stereotype.Service;

import com.amankumarm99.springbootswaggerui.model.UserModel;

@Service
public class UserService {
	public UserModel getUserById(long id){
		return new UserModel(id, "User"+id);
	}
}
