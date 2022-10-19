package com.algaworks.curso.joo.novidades8.lambda.dao;

import java.util.ArrayList;
import java.util.List;

import com.algaworks.curso.joo.novidades8.lambda.modelo.Fatura;

public class FaturaDAO {

	public List<Fatura> buscaFaturasVencidas() {
		// Simulando acesso ao banco de dados
		List<Fatura> faturas = new ArrayList<>();
		faturas.add(new Fatura("joao@gemail.com", 350.15));
		faturas.add(new Fatura("maria@hemail.com", 140.60));
		faturas.add(new Fatura("pedro@iemail.com", 280.60));
		
		return faturas;
	}
	
}
