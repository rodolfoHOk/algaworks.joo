package com.algaworks.curso.joo.maisEframework.properties.src;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LendoArquivoProperties {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Properties props = new Properties();
//			props.setProperty("chave", "valor");
		props.load(new FileInputStream("./config/config.properties"));
		
		//Conectar no banco de dados
		String url = props.getProperty("banco.dados.url");
		String usuario = props.getProperty("banco.dados.usuario");
		String senha = props.getProperty("banco.dados.senha");
		
		System.out.println("Conectando no banco de dados de url: " + url + " e usuário: " + usuario);
		System.out.println(senha);			
		
		try {
			int x = 5 / 0;
			System.out.println(x);
		} catch(Exception e) {
			// Se acontecer algum erro informar o administrador por e-mail
			String email = props.getProperty("email.admin");
			System.err.println("Informando erro \"" + e.getMessage() + "\" para o administrador de email: " + email);
		}
	}
	
}
