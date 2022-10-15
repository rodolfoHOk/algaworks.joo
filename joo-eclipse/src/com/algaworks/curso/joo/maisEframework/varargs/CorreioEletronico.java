package com.algaworks.curso.joo.maisEframework.varargs;

public class CorreioEletronico {

//	public void enviarEmails(String[] emails) {
	public void enviarEmails(String... emails) { // VarArgs
		for (String email : emails) {
			// envia e-mail
			System.out.println("E-mail enviado para: " + email);
		}
	}
	
}
