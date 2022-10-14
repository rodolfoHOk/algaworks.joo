package com.algaworks.curso.joo.maisEframework.stringBufferEstringBuilder;

public class ExemploStringBuffer {
	
	public static void main(String[] args) {
		// StringBuffer é mutável ao contrário da String
		StringBuffer sb = new StringBuffer();
		
		sb.append("Bem vindo ao curso de Java. ");
		sb.append("Fique a vontade para tirar suas dúvidas. ");
		sb.append("Estamos aqui para te ajudar. ");
		System.out.println(sb.toString());
		
		sb.insert(26, " da Algaworks");
		System.out.println(sb);
		
		// StringBuilder é mutável ao contrário da String
		StringBuilder sbd = new StringBuilder();
		
		sbd.append("Bem vindo ao curso de Java. ");
		sbd.append("Fique a vontade para tirar suas dúvidas. ");
		sbd.append("Estamos aqui para te ajudar. ");
		System.out.println(sbd.toString());
		
		sbd.insert(26, " da Algaworks");
		System.out.println(sbd);
		
		// Diferença
		// StringBuilder não é thread safe -> mais rápido
		// StringBuffer é thread safe -> use no contexto de concorrência
	}
	
}
