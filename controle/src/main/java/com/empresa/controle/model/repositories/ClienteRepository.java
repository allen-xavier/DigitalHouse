package com.empresa.controle.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.empresa.controle.model.entities.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer>{
	
}