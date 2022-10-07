package com.algaworks.curso.joo.desafios.financeiro.modelo;

public class Conta {

	private String descricao;
	private double valor;
	private String dataVencimento;
	protected SituacaoConta situacaoConta;
	
	public Conta() {
		this.situacaoConta = SituacaoConta.PENDENTE;
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

	public void cancelar() {
		if (situacaoConta.equals(SituacaoConta.CANCELADA) || situacaoConta.equals(SituacaoConta.PAGA)) {
			System.out.println("\nErro!");
			System.out.println("Uma conta só pode ser cancelada se a situação atual for PENDENTE");
			System.out.println("Situação atual é: " + situacaoConta);
		} else if (situacaoConta.equals(SituacaoConta.PENDENTE)) {
			System.out.println("\nCancelamento");
			System.out.println("-------------------");
			System.out.println("Conta: " + descricao + " foi cancelada!");
			situacaoConta = SituacaoConta.CANCELADA;
		}
	}
	
}
