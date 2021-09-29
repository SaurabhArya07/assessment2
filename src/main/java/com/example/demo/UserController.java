package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController { // POJO - Plain old java object
	@GetMapping("/")
	void getUsers() {
		System.out.println("called..");
	}
	@GetMapping("/{id}")
	void getUser(@PathVariable Integer id) {
		System.out.println("Called..."+id);
	}
	@PostMapping
	String postcall(@RequestBody User user) {
		System.out.println("Got user :"+ user.getName());
		return "Post called";
	}
	@PutMapping
	String updateCall() {
		return "Put called..";
	}
}
