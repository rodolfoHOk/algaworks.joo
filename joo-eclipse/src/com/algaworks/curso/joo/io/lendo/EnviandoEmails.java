package com.algaworks.curso.joo.io.lendo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EnviandoEmails {

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader("./emails.txt"))) {
			
			String email = null;
			while ((email = reader.readLine()) != null) {
				System.out.println("Enviando e-mail para: " + email);
			}
			
		} catch (FileNotFoundException e) {
			System.err.println("Arquivo não encontrado. Erro: " + e.getMessage());
		} catch (IOException e) {
			System.err.println("Não conseguiu ler o arquivo. Erro: " + e.getMessage());
		}
	}
	
}
