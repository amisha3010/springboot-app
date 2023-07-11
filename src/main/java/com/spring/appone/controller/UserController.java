package com.spring.appone.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.appone.repository.entity.Users;
import com.spring.appone.repository.UserRepository;

@RestController
@CrossOrigin
public class UserController {
	
@Autowired
private UserRepository userRepository;

@GetMapping("/test")
public String test()
{
	return "Welcome to backend of api";
}
//get all users
@GetMapping("/users")
public List<Users> getUsers()
{
	return userRepository.findAll();
}

//register user
@PostMapping("/users/add")
public Users addUser(@RequestBody Users user)

{
	return userRepository.save(user);
}

//fetch details for login using mail
@RequestMapping("/users/{email}")
public Optional<Users> getlogin(@PathVariable("email") String email) {
    return userRepository.findById(email);
    
}

}
