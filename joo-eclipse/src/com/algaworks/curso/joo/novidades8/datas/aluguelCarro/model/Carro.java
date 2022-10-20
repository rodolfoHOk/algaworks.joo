package com.algaworks.curso.joo.novidades8.datas.aluguelCarro.model;

import java.math.BigDecimal;
import java.time.Year;

public class Carro {

	private String modelo;
	private BigDecimal valorDiaria;
	private Year anoFabricacao;
	
	public Carro(String modelo, BigDecimal valorDiaria, Year anoFabricacao) {
		this.modelo = modelo;
		this.valorDiaria = valorDiaria;
		this.anoFabricacao = anoFabricacao;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public BigDecimal getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(BigDecimal valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public Year getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Year anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	@Override
	public String toString() {
		return "Carro: {modelo: " + modelo + ", valor_diaria: " + valorDiaria + ", ano_fabricacao: " + anoFabricacao + "}";
	}
	
	
	
}
