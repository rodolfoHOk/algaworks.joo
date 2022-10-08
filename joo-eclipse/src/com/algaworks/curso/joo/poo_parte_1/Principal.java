package com.algaworks.curso.joo.poo_parte_1;

public class Principal {

	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.fabricante = "Fiat";
		carro.modelo = "Palio";
		carro.cor = "Prata";
		carro.anoDeFabricacao = 2022;
		
		carro = null; // garbage collector quando rodar exclui o objeto da memória
		
//		carro.biCombustivel = true; // NullPointerException
		
		
	}
	
}
