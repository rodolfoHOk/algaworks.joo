package com.algaworks.curso.joo.wrappers_boxing_arrays;

public class TesteArrays {

	public static void main(String[] args) {
	
		// int[] notas;
		// notas = new int[4];
		int[] notas = new int[5];
		
		notas[0] = 10;
		notas[1] = 5;
		notas[2] = 8;
		notas[3] = 9;
		notas[4] = 7;
		
		System.out.println("Tamanho do array: " + notas.length);
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Posição[" + i + "] - Nota do aluno " + (i + 1) + " : " + notas[i]);
		}
		
		System.out.println();
		
		// String[] strings = new String[4];
		Carro[] carros = new Carro[4];
		carros[0] = new Carro();
		carros[0].anoDeFabricacao = 2022;
		
		System.out.println("Ano de fabricação do primeiro carro: " + carros[0].anoDeFabricacao);
		
	}
	
}
