package com.educandoweb.workshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.workshop.entities.User;
import com.educandoweb.workshop.repositories.UserRepository;

@Service
public class UserService {

	@Autowired   //Para que o Spring faça essa injeção de dependencia em transparente ao programador
	private UserRepository repository;  //Dependencia para repository
	
	//Operação na camada de serviço que é o findAll() que repassa a chamada para o repository.findAll()
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}