package com.empresa.controle.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.empresa.controle.model.entities.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, String>{

}