package com.algaworks.curso.joo.desafios.seguradora.modelo;

public class Notebook implements Seguravel {
	
	private double valorMercado;
	private int anoFabricacao;
	
	public Notebook(double valorMercado, int anoFabricacao) {
		super();
		this.valorMercado = valorMercado;
		this.anoFabricacao = anoFabricacao;
	}

	@Override
	public double calcularValorApolice() {
		double valorApolice =  this.valorMercado * 0.05;
		
		if (anoFabricacao < 2015) {
			valorApolice = valorApolice * 0.1;
		}
		
		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		return "Notebook ano " + this.anoFabricacao +
				" com valor de mercado " + this.valorMercado;
	}

	public double getValorMercado() {
		return valorMercado;
	}

	public void setValorMercado(double valorMercado) {
		this.valorMercado = valorMercado;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

}
