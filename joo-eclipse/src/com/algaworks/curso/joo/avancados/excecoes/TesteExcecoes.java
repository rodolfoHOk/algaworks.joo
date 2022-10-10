package com.algaworks.curso.joo.avancados.excecoes;

public class TesteExcecoes {
	
	public static void main(String[] args) {
//		System.out.println("Antes");
//		int numero = 5 / 0; // lança  java.lang.ArithmeticException
//		System.out.println("Depois");
//		System.out.println(numero);
		
//		String s = "Um texto qualquer";
//		s = null;
//		String maiuscula = s.toUpperCase(); // lança  java.lang.NullPointerException
//		System.out.println(maiuscula);
		
		ContaCorrente cc = new ContaCorrente(1000);
				
		try {
			cc.depositar(-10);
		} catch (IllegalArgumentException e){
			System.out.println("Você executou uma operação ilegal: " + e.getMessage());
		}
		
	}
	
}
