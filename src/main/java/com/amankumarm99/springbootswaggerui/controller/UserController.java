package com.amankumarm99.springbootswaggerui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amankumarm99.springbootswaggerui.model.UserModel;
import com.amankumarm99.springbootswaggerui.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
	@Autowired
	private UserService service;

	@GetMapping({"/info/{id}"})
	public UserModel getUser(@PathVariable long id) {
		return this.service.getUserById(id);
	}
	
	@GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
