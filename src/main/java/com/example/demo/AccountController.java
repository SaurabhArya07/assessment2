package com.example.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/account")
@RestController
public class AccountController {
	
	ArrayList<Customer> customers = new ArrayList<>();
	@GetMapping("/")
	ArrayList<Customer>getAllUserDetails() {
		return customers;
	}
	
	@GetMapping("/{id}")
	Customer getUserDetail(@PathVariable String AcntNumber) {
		for(Customer cus: customers) {
			if(cus.getAccountNumber().equals(AcntNumber)) {
				return cus;
			}
		}
		return null;
	}
	
	@PostMapping()
	String addEntry(@RequestBody Customer customer) {
		System.out.println(customer);
		customers.add(customer);
		return "Account added successfully!!";
	}
	
	
}
