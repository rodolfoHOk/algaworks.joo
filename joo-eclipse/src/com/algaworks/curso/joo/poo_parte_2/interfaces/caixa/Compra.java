package com.algaworks.curso.joo.poo_parte_2.interfaces.caixa;

import com.algaworks.curso.joo.poo_parte_2.interfaces.impressao.Imprimivel;
import com.algaworks.curso.joo.poo_parte_2.interfaces.pagamento.Autorizavel;

public class Compra implements Autorizavel, Imprimivel {
	
	private double valorTotal;
	private String produto;
	private String nomeCliente;

	@Override
	public double getValorTotal() {
		return valorTotal ;
	}
	
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	@Override
	public String getCabecalhoPagina() {
		return this.getProduto() + " = " + this.getValorTotal();
	}

	@Override
	public String getCorpoPagina() {
		return this.nomeCliente;
	}
	
}
