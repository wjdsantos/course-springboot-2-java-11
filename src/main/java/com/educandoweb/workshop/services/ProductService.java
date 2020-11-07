package com.educandoweb.workshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.workshop.entities.Product;
import com.educandoweb.workshop.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired   //Para que o Spring faça essa injeção de dependencia em transparente ao programador
	private ProductRepository repository;  //Dependencia para repository
	
	//Operação na camada de serviço que é o findAll() que repassa a chamada para o repository.findAll()
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
