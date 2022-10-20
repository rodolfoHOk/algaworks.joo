package com.algaworks.curso.joo.novidades8.datas.aluguelCarro.exemplos;

import java.math.BigDecimal;
import java.time.Year;
import java.util.Arrays;
import java.util.List;

import com.algaworks.curso.joo.novidades8.datas.aluguelCarro.model.Carro;

public class CadastroCarro {

	public static void main(String[] args) {
		
		Carro gol = new Carro("Gol", new BigDecimal("90.00"), Year.of(2019));
		Carro cruze = new Carro("Cruze", new BigDecimal("200.00"), Year.parse("2020"));
		Carro celta = new Carro("Celta", new BigDecimal("80.00"), Year.of(2018));
		
		List<Carro> carros = Arrays.asList(gol, cruze, celta);
		
		carros.stream()
			.filter(carro -> carro.getAnoFabricacao().isAfter(Year.of(2019)))
			.forEach(carro -> System.out.println(carro.getModelo()));
		
	}
	
}
