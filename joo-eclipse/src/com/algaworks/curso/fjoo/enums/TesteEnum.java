package com.algaworks.curso.fjoo.enums;

public class TesteEnum {

	public static void main(String[] args) {
		
		// Enum Naipe
		
		Carta quatroPaus = new Carta(4, Naipe.PAUS);
		quatroPaus.imprimirCarta();
		
		// Enum Operacao Aritimetica
		
		OperacaoAritmetica o1 = OperacaoAritmetica.ADICAO;
		int resultado1 = o1.operacao(6, 3);
		System.out.println(resultado1);
		
		OperacaoAritmetica o2 = OperacaoAritmetica.SUBTRACAO;
		int resultado2= o2.operacao(6, 3);
		System.out.println(resultado2);
		
		OperacaoAritmetica o3 = OperacaoAritmetica.MULTIPLICACAO;
		int resultado3= o3.operacao(6, 3);
		System.out.println(resultado3);
		
		OperacaoAritmetica o4 = OperacaoAritmetica.DIVISAO;
		int resultado4= o4.operacao(6, 3);
		System.out.println(resultado4);
		
		for (OperacaoAritmetica oa : OperacaoAritmetica.values()) {
			System.out.println(oa + " -> " + oa.operacao(10, 5));
		}
		
	}
	
}
