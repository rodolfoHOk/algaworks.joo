package com.algaworks.curso.joo.maisEframework.generics;

public class TesteGaveta {

	public static void main(String[] args) {
		Gaveta<String> gaveta = new Gaveta<>("De nomes");
		
		gaveta.colocar("João");
		gaveta.colocar("Maria");
		
		System.out.println(gaveta.retirarPrimeiro());
		System.out.println(gaveta.retirarPrimeiro());
		System.out.println(gaveta.retirarPrimeiro());
		
		// --------
		
		Gaveta<Integer> gavetaNumeros = new Gaveta<>("De números");
		gavetaNumeros.colocar(10);
		gavetaNumeros.colocar(33);
		
		System.out.println(gavetaNumeros.retirarPrimeiro() + 2);
		System.out.println(gavetaNumeros.retirarPrimeiro() + 3);
	}
	
}
