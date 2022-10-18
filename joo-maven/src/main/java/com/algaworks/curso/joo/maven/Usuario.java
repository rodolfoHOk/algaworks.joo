package com.algaworks.curso.joo.maven;

import static org.apache.commons.lang3.StringUtils.isBlank;;

public class Usuario {

	private String nome;
	private int idade;
	
	public Usuario(String nome, int idade) {
		if (isBlank(nome)) {
			throw new IllegalArgumentException("Nome deve ser informado");
		}
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
	
}
