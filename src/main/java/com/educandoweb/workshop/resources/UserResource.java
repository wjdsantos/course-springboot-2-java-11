package com.educandoweb.workshop.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.workshop.entities.User;
import com.educandoweb.workshop.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@Autowired  //Anotation para que o Spring faça a injeção de dependencia pra mim 
	private UserService service;
	
			//End Point
	@GetMapping  //Porque vai ser uma requisição do tipo Get
	public ResponseEntity<List<User>> findAll() {
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
			//End Point
	@GetMapping(value = "/{id}")  //Porque vai ser uma requisição do tipo Get. Esse em especial vai receber um parametro id
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
