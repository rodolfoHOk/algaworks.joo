package com.algaworks.cursojava.financeiro.modelo;

public class ContaPagar {

	private Fornecedor fornecedor;
	private String descricao;
	private double valor;
	private String dataVencimento;
	private SituacaoConta situacaoConta;
	
	public ContaPagar() {
		this.situacaoConta = SituacaoConta.PENDENTE;
	}

	public ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento) {
		this();
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
	
	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}

	public void pagar() {
		if (situacaoConta.equals(SituacaoConta.CANCELADA) || situacaoConta.equals(SituacaoConta.PAGA)) {
			System.out.println("\nErro!");
			System.out.println("Uma conta só deve ser paga se a situação atual for PENDENTE");
			System.out.println("Situação atual é: " + situacaoConta);
		} else if (situacaoConta.equals(SituacaoConta.PENDENTE)) {
			System.out.println("\nPagamento");
			System.out.println("-------------------");
			System.out.println("Descrição: " + getDescricao());
			System.out.println("Valor: " + getValor());
			System.out.println("Data Vencimento: " + getDataVencimento());
			System.out.println("Fornecedor: " + getFornecedor().getNome());
			situacaoConta = SituacaoConta.PAGA;
		} 
	}
	
	public void cancelar() {
		if (situacaoConta.equals(SituacaoConta.CANCELADA) || situacaoConta.equals(SituacaoConta.PAGA)) {
			System.out.println("\nErro!");
			System.out.println("Uma conta só deve ser cancelada se a situação atual for PENDENTE");
			System.out.println("Situação atual é: " + situacaoConta);
		} else if (situacaoConta.equals(SituacaoConta.PENDENTE)) {
			System.out.println("\nCancelamento");
			System.out.println("-------------------");
			System.out.println("Conta: " + getDescricao() + " foi cancelada!");
			situacaoConta = SituacaoConta.CANCELADA;
		}
	}
	
}
