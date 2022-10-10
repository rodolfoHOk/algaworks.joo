package com.algaworks.curso.joo.avancados.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

public class TesteNumeros {

	public static void main(String[] args) {
		
		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
		
		double valorProduto = 1300.59;
		System.out.println(formatador.format(valorProduto));
		
		double valorProduto2 = 13.59;
		System.out.println(formatador.format(valorProduto2));
		
		double valorProduto3 = 13;
		System.out.println(formatador.format(valorProduto3));
		
		double valorProduto4 = 13.59654321;
		System.out.println(formatador.format(valorProduto4));
		
		double valorProduto5 = 13.2;
		System.out.println(formatador.format(valorProduto5));
		
		String entrada = "R$ 50,34";
		try {
			double numero = formatador.parse(entrada).doubleValue();
			System.out.println("numero + 10: " + (numero + 10));
		} catch (ParseException e) {
			System.out.println("Entrada inválida");
		}
		
		BigDecimal bd = new BigDecimal(5000);
		System.out.println(bd.divide(BigDecimal.TEN));
		
	}
	
}
