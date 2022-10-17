package com.algaworks.curso.joo.maisEframework.expressoesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidandoEmails {

	public static void main(String[] args) {
		String[] emails = {"joao@exemplo.com", "errado@", "errado@exemplo", "patricia@exemplo.com", 
				"debora@exemplo.com.br", "errado@exemplo.combr", "errado@exemplo.com.",
				"errado@exemplo.com.br.uk", "maria.souza@exemplo.com.br", "jose_souza@exemplo.com.br", 
				"jose-silva@exemplo.com", ".errado@exemplo.com", "sandra@exemplo.iter.net"};
		
		Pattern pattern = Pattern.compile("\\w+[\\w_.-]*@\\w+(\\.\\w+)?\\.\\w{2,4}$(\\.\\w{2})?$");
		for (String email : emails) {
			Matcher matcher = pattern.matcher(email);
			
			if (matcher.matches()) {
				System.out.println(email + " é um e-mail válido");
			}
		}
	}
	
}
