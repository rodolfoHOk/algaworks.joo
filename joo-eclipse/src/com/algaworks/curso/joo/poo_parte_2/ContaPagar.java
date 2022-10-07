package com.algaworks.curso.joo.poo_parte_2;

public class ContaPagar {

	private Fornecedor fornecedor;
	private String descricao;
	private double valor;
	private String dataVencimento;
	
	public ContaPagar() {
	
	}

	public ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento) {
		super();
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	public void pagar() {
		System.out.println("\nPagamento");
		System.out.println("-------------------");
		System.out.println("Descrição: " + getDescricao());
		System.out.println("Valor: " + getValor());
		System.out.println("Data Vencimento: " + getDataVencimento());
		System.out.println("Fornecedor: " + getFornecedor().getNome());
	}
	
}
