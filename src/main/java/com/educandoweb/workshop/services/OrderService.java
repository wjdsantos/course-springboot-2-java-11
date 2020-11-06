package com.educandoweb.workshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.workshop.entities.Order;
import com.educandoweb.workshop.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired   //Para que o Spring faça essa injeção de dependencia em transparente ao programador
	private OrderRepository repository;  //Dependencia para repository
	
	//Operação na camada de serviço que é o findAll() que repassa a chamada para o repository.findAll()
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
