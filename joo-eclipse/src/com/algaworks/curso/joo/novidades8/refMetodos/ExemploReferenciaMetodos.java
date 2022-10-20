package com.algaworks.curso.joo.novidades8.refMetodos;

import java.util.List;

import com.algaworks.curso.joo.novidades8.lambda.dao.FaturaDAO;
import com.algaworks.curso.joo.novidades8.lambda.modelo.Fatura;

public class ExemploReferenciaMetodos {
	
	public static void main(String[] args) {
		List<Fatura> faturasVencidas = new FaturaDAO().buscaFaturasVencidas();
		
//		for (Fatura f: faturasVencidas) {
//			f.atualizarStatus();
//		}
		
//		faturasVencidas.forEach(f -> f.atualizarStatus());
		
		faturasVencidas.forEach(Fatura::atualizarStatus);
		
	}
	
}
