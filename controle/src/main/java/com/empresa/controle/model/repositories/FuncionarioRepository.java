package com.empresa.controle.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.empresa.controle.model.entities.Funcionario;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Integer> {

}