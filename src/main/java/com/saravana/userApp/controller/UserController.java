package com.saravana.userApp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saravana.userApp.exception.ResourceNotFoundException;
import com.saravana.userApp.model.User;
import com.saravana.userApp.repository.UserRepository;

@RestController
@RequestMapping("/")
public class UserController {
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/users")
	public String getAllUsers(Model model) {
		
		List<User> result=userRepository.findAll();
        model.addAttribute("users", result);
        return "list-user";

		
	}

}
