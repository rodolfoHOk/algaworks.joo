package com.algaworks.curso.joo.novidades8.stream;

import java.util.List;
import java.util.stream.Stream;

import com.algaworks.curso.joo.novidades8.stream.dao.FaturaDAO;
import com.algaworks.curso.joo.novidades8.stream.modelo.Fatura;

public class TesteStream {

	public static void main(String[] args) {
		List<Fatura> faturas = new FaturaDAO().buscaFaturasVencidas();
		
//		for (Fatura f: faturas) {
//			if (f.getValor() > 250.0) {
//				System.out.println("Alerta: Fatura de valor acima de R$ 250,00 -> " + f);
//			}
//		}
				
		faturas.stream()
			.filter(Fatura::estaEmRisco)
			.forEach(System.out::println); // não altera faturas
		
		System.out.println();
		Stream<Fatura> st = faturas.stream().filter(f -> f.getValor() > 250.0); // como não altera tem que salvar em nova variável
		st.forEach(System.out::println);
		
		System.out.println();
		faturas.forEach(System.out::println); // teste para ver se alterou
	}
	
}
