package com.algaworks.curso.joo.maisEframework.expressoesRegulares;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class ReplaceString {
	
	public static void main(String[] args) {
//		String texto = "O valor do produto é R$ @x@.";
		String texto = "O valor do produto é R$ @xxx@.";
		
		BigDecimal valor = new BigDecimal(2.50);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		
//		String novoTexto = texto.replaceAll("@x@", formatador.format(valor));
		String novoTexto = texto.replaceAll("@x+@", formatador.format(valor));
		
		System.out.println(novoTexto);
	}
	
}
