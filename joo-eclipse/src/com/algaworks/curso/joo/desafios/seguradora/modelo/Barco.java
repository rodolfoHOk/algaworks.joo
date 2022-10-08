package com.algaworks.curso.joo.desafios.seguradora.modelo;

public class Barco implements Seguravel {
	
	private double valorMercado;
	private int pes;
	
	public Barco(double valorMercado, int pes) {
		super();
		this.valorMercado = valorMercado;
		this.pes = pes;
	}
	
	@Override
	public double calcularValorApolice() {
		double valorApolice =  this.valorMercado * 0.01;
		
		valorApolice = valorApolice + (pes * 0.001);
		
		return valorApolice;
	}
	@Override
	public String obterDescricao() {
		return "Barco com " + this.pes +
				"pés com valor de mercado " + this.valorMercado;
	}

	public double getValorMercado() {
		return valorMercado;
	}
	
	public void setValorMercado(double valorMercado) {
		this.valorMercado = valorMercado;
	}

	public int getPes() {
		return pes;
	}
	
}
