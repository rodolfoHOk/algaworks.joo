package com.algaworks.curso.joo.poo_parte_2;

public class ExemploThis {

	public static void main(String[] args) {
	
		Carro carro = new Carro();
		carro.modelo = "Palio";
		
		System.out.println("Modelo antes: " + carro.modelo);
		
		carro.alterarModelo("Palio Weekend");
		
		System.out.println("Modelo depois: " + carro.modelo);
	}
	
}
