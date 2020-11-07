package com.educandoweb.workshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.workshop.entities.Category;
import com.educandoweb.workshop.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired   //Para que o Spring faça essa injeção de dependencia em transparente ao programador
	private CategoryRepository repository;  //Dependencia para repository
	
	//Operação na camada de serviço que é o findAll() que repassa a chamada para o repository.findAll()
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
