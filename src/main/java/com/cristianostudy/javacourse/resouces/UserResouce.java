package com.cristianostudy.javacourse.resouces;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cristianostudy.javacourse.entities.User;


// to inform that this class is a WEB RESOURCE, we need to use the annotation bellow
@RestController
// To give a name to the resource ("URL name")
@RequestMapping(value = "/users")
public class UserResouce {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Teste User", "testeuser@email.com", "980807777", "1234321");
		return ResponseEntity.ok().body(u);
	}
}
