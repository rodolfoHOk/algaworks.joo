package com.algaworks.curso.joo.novidades7;

public class ExemploSeparadorDigitosLiterais {
	
	public static void main(String[] args) {
		
//		long populacaoSaoPaulo = 11000000L; // antes java 7
		long populacaoSaoPaulo = 11_000_000L; // java 7
		long populacaoGrandeSaoPaulo = 11_000_000 + 9_000_000;

		System.out.printf("População de São Paulo: %d\n", populacaoSaoPaulo);
		System.out.printf("População da Grande São Paulo: %d\n", populacaoGrandeSaoPaulo);
		
		double precoVeiculo = 200_000.99_1d;
		System.out.printf("Preço do veículo: %.3f\n", precoVeiculo);
		
		// Evite usar assim
		int x = 1___2___3;
		int y = 1_2_3;
		
		System.out.printf("x e y são iguais? %b", (x == y));
	}
	
}
