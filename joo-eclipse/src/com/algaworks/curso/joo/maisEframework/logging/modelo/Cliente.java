package com.algaworks.curso.joo.maisEframework.logging.modelo;

public class Cliente {
	
	private String nome;

	public Cliente(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + "]";
	}
	
}
