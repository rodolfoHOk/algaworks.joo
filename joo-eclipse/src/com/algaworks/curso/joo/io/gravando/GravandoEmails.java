package com.algaworks.curso.joo.io.gravando;

//import java.io.BufferedWriter;
//import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class GravandoEmails {

	public static void main(String[] args) {
		String[] emails = {"joao2@gemail.com", "maria2@hemail.com", "pedro2@iemail.com"};
		
//		BufferedWriter writer = null; // antes do java 7
//		try {
//			writer = new BufferedWriter(new FileWriter("./emails.txt"));
//		try (BufferedWriter writer = new BufferedWriter(new FileWriter("./emails.txt"))) { // java 7
		// Como na linha acima sobrescreve o arquivo, na linha abaixo adiciona ao arquivo
//		try (BufferedWriter writer = new BufferedWriter(new FileWriter("./emails.txt", true))) {  
		try (PrintStream printer = new PrintStream("./emails2.txt")) {
			for (String email: emails) {
//				writer.write(email);
//				writer.newLine();
				printer.println(email);
			}
		} catch (IOException e) {
			System.out.println("Não conseguiu gravar o arquivo. " + e.getMessage());
//		} finally { // antes do Java 7
//			try {
//				writer.close();
//			} catch (IOException e) {
//				System.out.println(e.getMessage());
//			}
		}	
	}
	
}
