package com.algaworks.curso.joo.desafios.financeiro.modelo;

public class ContaPagar  extends Conta {

	private Fornecedor fornecedor;
	
	public ContaPagar() {
		super();
	}
	
	public ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento) {
		super();
		this.fornecedor = fornecedor;
		super.setDescricao(descricao);
		super.setValor(valor);
		super.setDataVencimento(dataVencimento);
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public void pagar() throws OperacaoContaException {
		if (situacaoConta.equals(SituacaoConta.CANCELADA) || situacaoConta.equals(SituacaoConta.PAGA)) {
//			System.out.println("\nErro!");
//			System.out.println("Uma conta só deve ser paga se a situação atual for PENDENTE");
//			System.out.println("Situação atual é: " + situacaoConta);
			throw new OperacaoContaException("Uma conta só deve ser paga se a situação atual for PENDENTE");
		} else if (situacaoConta.equals(SituacaoConta.PENDENTE)) {
			System.out.println("\nPagamento");
			System.out.println("-------------------");
			System.out.println("Descrição: " + getDescricao());
			System.out.println("Valor: " + getValor());
			System.out.println("Data Vencimento: " + getDataVencimento());
			System.out.println("Fornecedor: " + fornecedor.getNome());
			situacaoConta = SituacaoConta.PAGA;
		}
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("Conta a Pagar");
		System.out.println("-------------------");
		System.out.println("Descrição: " + getDescricao());
		System.out.println("Valor: " + getValor());
		System.out.println("Data Vencimento: " + getDataVencimento());
		System.out.println("Fornecedor: " + fornecedor.getNome());
	}
	
}
