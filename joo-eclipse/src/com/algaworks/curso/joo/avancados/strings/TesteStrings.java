package com.algaworks.curso.joo.avancados.strings;

public class TesteStrings {
	
	public static void main(String[] args) {
		// Classes String, StringBuffer e StringBuilder
		
		// Classe String é imutável
		String s = "Olá"; // Criada a String "Olá"
		s+= " Pessoal!"; // Criada a String "Olá Pessoal!"
		System.out.println("Com String: " + s);
		
		// Para evitar criar várias strings quando concatenada
		StringBuilder sb = new StringBuilder("Olá"); // Criada a StringBuilder
		sb.append(" Pessoal!"); // Reaproveita a StringBuilder não desperdiça recursos
		String resultado = sb.toString(); // Criada a String "Olá Pessoal!"
		System.out.println("Com StringBuilder: " + resultado);
		
		// StringBuilder não é protegida para multi threads porém mais performática
		// StringBuffer é protegida para multi threads por isso menos performática
	}
	
}
