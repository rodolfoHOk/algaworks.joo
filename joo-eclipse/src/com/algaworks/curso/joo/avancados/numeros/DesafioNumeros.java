package com.algaworks.curso.joo.avancados.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class DesafioNumeros {
	
	public static void main(String[] args) {
		System.out.println(calculaDezPorCento(1340.99));
	}
	
	private static String calculaDezPorCento(double valorProduto) {
		BigDecimal valorBigDecimal = new BigDecimal(valorProduto);
		BigDecimal dezPorCento = valorBigDecimal.divide(BigDecimal.TEN);
		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
		return formatador.format(dezPorCento.doubleValue());
	}	
	
}

