package com.algaworks.curso.joo.novidades8.datas.aluguelCarro.model;

import java.time.LocalDateTime;

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
	
}
