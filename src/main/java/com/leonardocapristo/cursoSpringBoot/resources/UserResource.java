package com.leonardocapristo.cursoSpringBoot.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonardocapristo.cursoSpringBoot.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	
	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User u = new User(1L, "LEonardo", "leo@gmail.com", "123432423", "leo123");
		return ResponseEntity.ok().body(u);
	}
}
