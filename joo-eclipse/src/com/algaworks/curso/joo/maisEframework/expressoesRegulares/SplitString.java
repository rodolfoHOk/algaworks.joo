package com.algaworks.curso.joo.maisEframework.expressoesRegulares;

public class SplitString {

	public static void main(String[] args) {
//		String texto = "O Java é uma linguagem orientada a objetos";
//		String texto = "O4Java1é3uma9linguagem9orientada1a7objetos";
		String texto = "O44Java11é33uma99linguagem99orientada11a77objetos";
		
//		String[] palavras = texto.split(" ");
//		String[] palavras = texto.split("\\d");
		String[] palavras = texto.split("\\d+");
		
		for (String palavra : palavras) {
			System.out.println(palavra);
		}
	}
	
}
