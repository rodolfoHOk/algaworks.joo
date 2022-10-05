package com.algaworks.curso.fjoo.modificadorStatic;

public class TesteContador {

	public static void main(String[] args) {
		
//		Contador.count++;
//		
//		int valorDoCount = Contador.count;
//		
//		System.out.println("Valor: " + valorDoCount);
		
		Contador c = new Contador();
		c.incrementar();
//		imprimirContador();
		Contador.imprimirContador();
		
		Contador.count++;
//		System.out.println(c.count);
//		imprimirContador();
		Contador.imprimirContador();
		
	}
	
//	public static void imprimirContador() {
//		System.out.println("O valor do contador agora é: " + Contador.count);
//	}
	
}
