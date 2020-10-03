package com.empresa.controle.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcionario {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id_funcionario;
	private String nome;
	private String cpf;
	private String dataNasc;
	private String cargo;
	private String email;
	private double salario;
	private String senha;
	private int habilitado;
	
	public Funcionario () {}
	
	public Funcionario(String nome, String cpf, String dataNasc, String cargo, String email, String senha, double salario,
			int habilitado) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
		this.cargo = cargo;
		this.email = email;
		this.senha = senha;
		this.salario = salario;
		this.habilitado = habilitado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getHabilitado() {
		return habilitado;
	}

	public void setHabilitado(int habilitado) {
		this.habilitado = habilitado;
	}

	public int getId_funcionario() {
		return id_funcionario;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}