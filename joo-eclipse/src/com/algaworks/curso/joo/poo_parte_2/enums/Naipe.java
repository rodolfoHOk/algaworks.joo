package com.algaworks.curso.joo.poo_parte_2.enums;

public enum Naipe {

	OUROS("Vermelho"),
	PAUS("Preto"),
	ESPADAS("Preto"),
	COPAS("Vermelho");
	
	private String cor;

	Naipe(String cor) {
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}
	
}
