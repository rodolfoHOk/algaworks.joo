package com.algaworks.curso.joo.desafios.financeiro.modelo;

public class ContaReceber extends Conta {

	private Cliente cliente;
	
	public ContaReceber() {
		super();
	}
	
	public ContaReceber(Cliente cliente, String descricao, double valor, String dataVencimento) {
		super();
		this.cliente = cliente;
		super.setDescricao(descricao);
		super.setValor(valor);
		super.setDataVencimento(dataVencimento);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void receber() {
		if (situacaoConta.equals(SituacaoConta.CANCELADA) || situacaoConta.equals(SituacaoConta.PAGA)) {
			System.out.println("\nErro!");
			System.out.println("Uma conta só deve ser recebida se a situação atual for PENDENTE");
			System.out.println("Situação atual é: " + situacaoConta);
		} else if (situacaoConta.equals(SituacaoConta.PENDENTE)) {
			System.out.println("\nRecebimento");
			System.out.println("-------------------");
			System.out.println("Descrição: " + getDescricao());
			System.out.println("Valor: " + getValor());
			System.out.println("Data Vencimento: " + getDataVencimento());
			System.out.println("Cliente: " + cliente.getNome());
			situacaoConta = SituacaoConta.PAGA;
		}
	}
	
	public void cancelar() {
		if (getValor() >=  50000) {
			System.out.println("\nErro!");
			System.out.println("Uma conta só pode ser cancelada se o valor for menor que 50000");
			System.out.println("O valor da conta é: " + getValor());
		} else {
			super.cancelar();
		}
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("Conta a Receber");
		System.out.println("----------------------");
		System.out.println("Descrição: " + getDescricao());
		System.out.println("Valor: " + getValor());
		System.out.println("Data Vencimento: " + getDataVencimento());
		System.out.println("Cliente: " + cliente.getNome());
	}
	
}
