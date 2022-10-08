package com.algaworks.curso.joo.avancados.classeMath;

import static java.lang.Math.PI;
import static java.lang.Math.max;

public class TesteClasseMath {
	
//	static final double PI = 3.1415;

	public static void main(String[] args) {
		
		// comprimento de uma circunferência
		
		double raio = 4;
//		double PI = 3.1415
//		double comprimento = 2 * raio * PI;
//		double comprimento = 2 * raio * Math.PI; // PI da classe Math
		double comprimento = 2 * raio * PI; // PI da classe Math importação estática
		System.out.println("Comprimento: " + comprimento);
		
		// máximo e mínimo
		
		double[] precosProdutoX = {30.20, 25.49};
		System.out.println("Maior preço: " + Math.max(precosProdutoX[0], precosProdutoX[1]));
		System.out.println("Maior preço: " + max(precosProdutoX[0], precosProdutoX[1])); //  importação estática
		System.out.println("Menor preço: " + Math.min(precosProdutoX[0], precosProdutoX[1]));
		
		// Potência
		
		System.out.println("2^3: " + Math.pow(2, 3));
		
		// Raiz quadrada
		
		System.out.println("Raiz quadrada de 9: " + Math.sqrt(9));
		
		// Arredondamento ceil, floor, round
		
		double n = 5.68;
		double n2 = 5.49;
		double n3 = 5.5;
		System.out.println("Inteiro maior: " + Math.ceil(n));
		System.out.println("Inteiro menor: " + Math.floor(n));
		System.out.println("Inteiro próximo (arredondando): " + Math.round(n));
		System.out.println("Inteiro próximo (arredondando): " + Math.round(n2));
		System.out.println("Inteiro próximo (arredondando): " + Math.round(n3));
		
		// Trigonometria
		
		System.out.println("Seno 60°: " + Math.sin(Math.toRadians(60)));
		System.out.println("Coseno 60°: " + Math.cos(Math.toRadians(60)));
		System.out.println("Seno 30°: " + Math.sin(Math.toRadians(30)));
		System.out.println("Coseno 30°: " + Math.cos(Math.toRadians(30)));
		System.out.println("Tangente 45° " + Math.tan(Math.toRadians(45)));
		
		// Números randômicos
		
		double numeroAleatorio = Math.random(); // entre 0 e 1
		System.out.println(numeroAleatorio);
		double numeroAleatorio100 = Math.random() * 100; // entre 0 e 100
		System.out.println(numeroAleatorio100);
		int numeroInteiroAleatorio100 = (int) Math.round(numeroAleatorio100); // entre 0 e 100
		System.out.println(numeroInteiroAleatorio100);
		
	}
	
}
