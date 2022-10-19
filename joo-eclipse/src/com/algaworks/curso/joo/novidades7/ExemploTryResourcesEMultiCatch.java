package com.algaworks.curso.joo.novidades7;

import java.util.Scanner;

public class ExemploTryResourcesEMultiCatch {

	public static void main(String[] args) {
		// Antes Java 7
//		Scanner entrada = null;
//		try {
//			entrada = new Scanner(System.in);
//			
//			System.out.print("Informe o nome: ");
//			String nome = entrada.nextLine();
//			
//			System.out.print("Informe a idade: ");
//			String idade = entrada.nextLine();
//			
//			SalvarAluno.salvar(nome, idade);
//		} catch (Exception e) {
//			System.err.println(e.getMessage());
//		} finally {
//			entrada.close();
//		}
		
		try (Scanner entrada = new Scanner(System.in)) { // Java 7 (para classes que implementam Closeable)
			System.out.print("Informe o nome: ");
			String nome = entrada.nextLine();
			
			System.out.print("Informe a idade: ");
			String idade = entrada.nextLine();
			
			try {
				SalvarAluno.salvar(nome, idade);
//			} catch (NegocioException e) { // antes Java 7
//				System.err.println("Impossível completar operação. Motivo: " + e.getMessage());
//			} catch (NumberFormatException e) {
//				System.err.println("Impossível completar operação. Motivo: " + e.getMessage());
			} catch (NegocioException | NumberFormatException e) {
				System.err.println("Impossível completar operação. Motivo: " + e.getMessage()); // Java 7
			}
		}
	}
	
}
