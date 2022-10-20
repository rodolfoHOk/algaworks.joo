package com.algaworks.curso.joo.novidades8.datas.aluguelCarro.model;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Aluguel {

	private Cliente cliente;
	private Carro carro;
	
	private LocalDateTime dataHoraRetirada;
	private LocalDateTime dataHoraPrevistaDevolucao;
	private LocalDateTime dataHoraDevolucao;
	
	public Aluguel(Cliente cliente, Carro carro, LocalDateTime dataHoraRetirada,
			LocalDateTime dataHoraPrevistaDevolucao) {
		this.cliente = cliente;
		this.carro = carro;
		this.dataHoraRetirada = dataHoraRetirada;
		this.dataHoraPrevistaDevolucao = dataHoraPrevistaDevolucao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public LocalDateTime getDataHoraRetirada() {
		return dataHoraRetirada;
	}

	public void setDataHoraRetirada(LocalDateTime dataHoraRetirada) {
		this.dataHoraRetirada = dataHoraRetirada;
	}

	public LocalDateTime getDataHoraPrevistaDevolucao() {
		return dataHoraPrevistaDevolucao;
	}

	public void setDataHoraPrevistaDevolucao(LocalDateTime dataHoraPrevistaDevolucao) {
		this.dataHoraPrevistaDevolucao = dataHoraPrevistaDevolucao;
	}

	public LocalDateTime getDataHoraDevolucao() {
		return dataHoraDevolucao;
	}

	public void setDataHoraDevolucao(LocalDateTime dataHoraDevolucao) {
		this.dataHoraDevolucao = dataHoraDevolucao;
	}

	public void imprimeFatura() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:00");
		
		boolean entregaPrazo = dataHoraDevolucao.isBefore(dataHoraPrevistaDevolucao.plusHours(1));
		
		if (entregaPrazo) {
			Duration tempo = Duration.between(dataHoraRetirada, dataHoraDevolucao);
			BigDecimal valor = BigDecimal
					.valueOf(tempo.toHours())
					.multiply(this.getCarro().getValorDiaria())
					.divide(BigDecimal.valueOf(24));
			
			imprimirDadosAluguel(formatter);
			System.out.println("Valor Total: R$ " + valor);
			
		} else {
			Duration tempo = Duration.between(dataHoraRetirada, dataHoraPrevistaDevolucao);		
			BigDecimal valor = BigDecimal
					.valueOf(tempo.toHours())
					.multiply(this.getCarro().getValorDiaria())
					.divide(BigDecimal.valueOf(24));
			
			Duration tempoExcesso = Duration.between(dataHoraPrevistaDevolucao, dataHoraDevolucao);
			BigDecimal multa = BigDecimal
					.valueOf(tempoExcesso.toHours())
					.multiply(this.carro.getValorDiaria())
					.divide(BigDecimal.TEN);
			
			imprimirDadosAluguel(formatter);
			
			System.out.println("Valor: R$ " + valor);
			System.out.println("Atraso: " + tempoExcesso.toHours() + " horas");
			System.out.println("Valor da multa: R$" + multa);
			System.out.println("Valor Total: R$" + valor.add(multa));
		}
	}

	private void imprimirDadosAluguel(DateTimeFormatter formatter) {
		System.out.println("<<<<<<<<<<<<<<<<<<<< FATURA >>>>>>>>>>>>>>>>>>>>");
		System.out.println("Cliente: " + this.getCliente().getNome());
		System.out.println("Carro: " + this.getCarro().getModelo());
		System.out.println("Data de hora retirada: " + this.getDataHoraRetirada().format(formatter));
		System.out.println("Data de hora prevista para devolução: " 
				+ this.getDataHoraPrevistaDevolucao().format(formatter));
		System.out.println("Data de hora devolução: " 
				+ this.getDataHoraDevolucao().format(formatter));
	}
	
	
}
