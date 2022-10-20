package com.algaworks.curso.joo.novidades8.datas.aluguelCarro.exemplos;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;

import com.algaworks.curso.joo.novidades8.datas.aluguelCarro.model.Aluguel;
import com.algaworks.curso.joo.novidades8.datas.aluguelCarro.model.Carro;
import com.algaworks.curso.joo.novidades8.datas.aluguelCarro.model.Cliente;

public class CadastroAluguel {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("João Santos", LocalDate.of(2000, Month.JUNE, 15));
		Carro gol = new Carro("Gol", new BigDecimal("90.00"), Year.of(2019));
		
		LocalDateTime dataHoraRetirada = 
				LocalDateTime.of(LocalDate.now(), LocalTime.of(LocalTime.now().getHour(), 0));
		LocalDateTime dataHoraPrevistaDevolucao = LocalDateTime.now().plusDays(5).plusHours(2);
		
		Aluguel aluguel = new Aluguel(cliente, gol, dataHoraRetirada, dataHoraPrevistaDevolucao);
		
		imprimirRecibo(aluguel);		
		
		aluguel.setDataHoraDevolucao(LocalDateTime.of(2022, Month.OCTOBER, 25, 16, 45));
		
	}

	private static void imprimirRecibo(Aluguel aluguel) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:00");
		
		System.out.println("<<<<<<<<<<<<<<<<<<<< RECIBO >>>>>>>>>>>>>>>>>>>>");
		System.out.println("Cliente: " + aluguel.getCliente().getNome());
		System.out.println("Carro: " + aluguel.getCarro().getModelo());
		System.out.println("Data de hora retirada: " + aluguel.getDataHoraRetirada().format(formatter));
		System.out.println("Data de hora prevista para devolução: " 
				+ aluguel.getDataHoraPrevistaDevolucao().format(formatter));
	}
	
}
