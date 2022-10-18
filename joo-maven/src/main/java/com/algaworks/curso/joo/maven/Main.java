package com.algaworks.curso.joo.maven;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.printf("Informe seu nome: ");
			String nome = entrada.nextLine();
			
			System.out.printf("Informe sua idade: ");
			int idade = entrada.nextInt();
			
			Usuario usuario = new Usuario(nome, idade);
			System.out.println("Obrigado, " + usuario.getNome() + " por se cadastrar.");
		} 
	}
	
}
