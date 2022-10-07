package com.algaworks.curso.joo.poo_parte_2.desafioStaticFinal;

public class MatematicaUtil {
	
	private static final double PI = 3.14;

	// http://pt.wikipedia.org/wiki/Número_de_Fibonacci
	public static int calcularFibonacci(int posicao) {
		if (posicao < 2) {
			return posicao;
		}
		return calcularFibonacci(posicao - 1) + calcularFibonacci(posicao - 2);
	}
	
	public static double calcularAreaCirculo(double raio) {
		return raio * raio * PI;
	}

}
