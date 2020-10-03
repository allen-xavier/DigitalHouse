package com.empresa.controle.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.controle.model.entities.Funcionario;
import com.empresa.controle.model.repositories.FuncionarioRepository;

@RestController
@RequestMapping("funcionario")
public class FuncionarioController {
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@GetMapping()
	public Iterable<Funcionario> getFuncionarios(){ 
		return funcionarioRepository.findAll();
	}
	
	@GetMapping("/{id}") 
	public Optional <Funcionario> getById(@PathVariable int id) { 
		return funcionarioRepository.findById(id); 
	}
	
	@PostMapping("/contratar")
	public Funcionario contratarFuncionario(@RequestBody Funcionario funcionario) {
		funcionarioRepository.save(funcionario);
		return funcionario;
	} 
	
	@PutMapping("salario/{idFuncinario}")
	public Funcionario atualizaSalario(@PathVariable int idFuncionario, @RequestBody Funcionario dadosFuncionario) throws Exception{
		
		Funcionario funcionarioDB = funcionarioRepository.findById(idFuncionario)
				.orElseThrow(() -> new IllegalAccessException());
		if(dadosFuncionario.getSalario()>funcionarioDB.getSalario())funcionarioDB.setSalario(dadosFuncionario.getSalario());
		
		funcionarioRepository.save(funcionarioDB); 
		
		return funcionarioDB;
	}
	
	@PutMapping("demitir/{idFuncinario}")
	public Funcionario atualizaHabilitado(@PathVariable int idFuncionario, @RequestBody Funcionario dadosFuncionario) throws Exception{
		
		Funcionario funcionarioDB = funcionarioRepository.findById(idFuncionario)
				.orElseThrow(() -> new IllegalAccessException());
		
		if(funcionarioDB.getHabilitado()!= 0)funcionarioDB.setHabilitado(dadosFuncionario.getHabilitado());
		
		funcionarioRepository.save(funcionarioDB); 
		
		return funcionarioDB;
	}
}