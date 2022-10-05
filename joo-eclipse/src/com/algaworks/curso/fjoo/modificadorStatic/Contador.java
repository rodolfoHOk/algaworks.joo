package com.algaworks.curso.fjoo.modificadorStatic;

public class Contador {

	public static final double PI = 3.14;
	public static int count = 0;
	
	public void incrementar() {
		count++;
	}
	
//	public void tentarMudarPI() {
//		PI = 4; // não é permitido pelo final
//	}
	
	public static void imprimirContador() {
		System.out.println("O valor do contador agora é: " + Contador.count);
	}
	
}
