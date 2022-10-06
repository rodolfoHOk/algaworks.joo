package com.algaworks.curso.fjoo.enums;

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
