package com.algaworks.curso.joo.poo_parte_1;

public class PetShop {
	
	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		cachorro.nome = "Bidu";
		cachorro.raca = "Scottish Terrier";
		cachorro.sexo = 'M';
		cachorro.idade = 3;
		
		System.out.println("Nome: " + cachorro.nome);
		System.out.println("Raça: " + cachorro.raca);
		System.out.println("Sexo: " + cachorro.sexo);
		System.out.println("Idade: " + cachorro.idade);
		
	}
	
}
