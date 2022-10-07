package com.algaworks.curso.joo.poo_parte_2;

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
	
	void alterarModelo(String modelo) {
		if (modelo != null) {
			this.modelo = modelo;
		}
	}
	
}
