package com.algaworks.curso.joo.avancados.coletaLixo;

public class Carro {
	
	String fabricante;
	String modelo;
	String cor;
	int anoDeFabricacao;
	boolean biCombustivel;
	
	Proprietario proprietario;
	
	void ligar() {
		if (modelo != null) {
			System.out.println("Ligando o carro: " + modelo);
		}
	}
	
}
