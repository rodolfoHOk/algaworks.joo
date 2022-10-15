package com.algaworks.curso.joo.maisEframework.varargs;

public class TesteCorreioEletronico {

	public static void main(String[] args) {
		CorreioEletronico correio = new CorreioEletronico();

//		Sem VarArgs
//		String[] emails = new String[3];
//		emails[0] = "maria@email.com";
//		emails[1] = "joao@email.com";
//		emails[2] = "jose@email.com";
//		
//		correio.enviarEmails(emails);	
//		correio.enviarEmails(new String[] {"maria@email.com", "joao@email.com", "jose@email.com"});
		
//		Com VarArgs
		correio.enviarEmails("maria@email.com", "joao@email.com", "jose@email.com");
		
	}
	
}
