package com.algaworks.curso.joo.novidades8.lambda;

import java.util.List;

import com.algaworks.curso.joo.novidades8.lambda.dao.FaturaDAO;
import com.algaworks.curso.joo.novidades8.lambda.modelo.Fatura;
import com.algaworks.curso.joo.novidades8.lambda.utils.EnviadorEmail;

public class ExemploLambda {

	public static void main(String[] args) {
		List<Fatura> faturasVencidas = new FaturaDAO().buscaFaturasVencidas();
		
		EnviadorEmail enviadorEmail = new EnviadorEmail();
		
//		for (Fatura f : faturasVencidas) { // sem lambda
//			enviadorEmail.enviar(f.getEmailDevedor(), f.resumo());
//		}
		
//		faturasVencidas.forEach(f -> enviadorEmail.enviar(f.getEmailDevedor(), f.resumo())); // com Lambda idem acima
		
		faturasVencidas.forEach(f -> {
			enviadorEmail.enviar(f.getEmailDevedor(), f.resumo());
			f.setEmailEnviado(true);
		});
	}
	
}
