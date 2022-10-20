package com.algaworks.curso.joo.novidades8.datas.aluguelCarro.exemplos;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;

import com.algaworks.curso.joo.novidades8.datas.aluguelCarro.model.Aluguel;
import com.algaworks.curso.joo.novidades8.datas.aluguelCarro.model.Carro;
import com.algaworks.curso.joo.novidades8.datas.aluguelCarro.model.Cliente;

public class DevolucaoCarro {

	public static void main(String[] args) {
		Aluguel aluguel = recuperarAluguel();
		
		// Para cada hora de atraso, paga 10% do valor da Diária de multa
		LocalDateTime dataHoraDevolucao = LocalDateTime.of(
				LocalDate.now().plusDays(4), LocalTime.now().plusHours(4));
		aluguel.setDataHoraDevolucao(dataHoraDevolucao);
		
		aluguel.imprimeFatura();
		
	}
	
	private static Aluguel recuperarAluguel() {
		Cliente cliente = new Cliente("João Santos", LocalDate.of(2000, Month.JUNE, 15));
		Carro gol = new Carro("Gol", new BigDecimal("90.00"), Year.of(2019));
		
		LocalDateTime dataHoraRetirada = 
				LocalDateTime.of(LocalDate.now(), LocalTime.of(LocalTime.now().getHour(), 0));
		LocalDateTime dataHoraPrevistaDevolucao = LocalDateTime.now().plusDays(3).plusHours(2);
		
		Aluguel aluguel = new Aluguel(cliente, gol, dataHoraRetirada, dataHoraPrevistaDevolucao);
		return aluguel;
	}
	
}
