package com.inmemory.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inmemory.models.Users;
import com.inmemory.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userReporsitory;
	
	@PostMapping("/addUser")
	public String saveUser(@RequestBody Users users) {
		try {
			userReporsitory.save(users);
		} catch(Exception e) {
			return "Error: " + e;
		}
		return "User Created";
	}
	
	@GetMapping("/getUsers")
	public List<Users> getUsers(){
		return userReporsitory.findAll();
	}
	
	@GetMapping("/getUser/{id}")
	public Optional<Users> getUser(@PathVariable int id){
		return userReporsitory.findById(id);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable int id) {
		userReporsitory.deleteById(id);
		return "User Deleted";
	}
}
