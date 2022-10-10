package com.algaworks.curso.joo.desafios.financeiro.modelo;

public class Principal {

	public static void main(String[] args) {
		// instanciando fornecedores
		Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setNome("Casa & Cia Negócios Imobiliários");
		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do João");
		
		// instanciando clientes
		Cliente atacadista = new Cliente();
		atacadista.setNome("Triângulo Quadrado Atacadista");
		Cliente telecom = new Cliente();
		telecom.setNome("FoneNet Telecomunicações");
		
		// instanciando contas a pagar
		ContaPagar contaPagar1 = new ContaPagar();
		contaPagar1.setDescricao("Aluguel da matriz");
		contaPagar1.setValor(1230d);
		contaPagar1.setDataVencimento("10/05/2012");
		contaPagar1.setFornecedor(imobiliaria);
		
		ContaPagar contaPagar2 = new ContaPagar(mercado, "Compras do mês", 390d, "19/05/2012");
		contaPagar2.situacaoConta = SituacaoConta.CANCELADA;
		
		// instanciando contas a receber
		ContaReceber contaReceber1 = new ContaReceber();
		contaReceber1.setDescricao("Desenvolvimento de projeto de logística em Java");
		contaReceber1.setValor(89500d);
		contaReceber1.setDataVencimento("23/05/2012");
		contaReceber1.setCliente(atacadista);
		
		ContaReceber contaReceber2 = new ContaReceber(telecom, "Manutenção em sistema de conta online", 
			53200d, "13/05/2012");
		contaReceber2.situacaoConta = SituacaoConta.PAGA;
		
		// exibe listagem de todas as contas com detalhamento
		RelatorioContas relatorio = new RelatorioContas();
		Conta[] contas = new Conta[]{contaPagar1, contaPagar2, contaReceber1, contaReceber2};
		
		relatorio.exibirListagem(contas);
		
		try {
			contaPagar1.pagar();
		} catch (OperacaoContaException e) {
			System.out.println("\nErro!");
			System.out.println(e.getMessage());
			System.out.println("Situação atual é: " + contaPagar1.situacaoConta);
		}
		
		try {
			contaPagar2.pagar();
		} catch (OperacaoContaException e) {
			System.out.println("\nErro!");
			System.out.println(e.getMessage());
			System.out.println("Situação atual é: " + contaPagar2.situacaoConta);
		}
		
		try {
			contaReceber1.receber();
		} catch (OperacaoContaException e) {
			System.out.println("\nErro!");
			System.out.println(e.getMessage());
			System.out.println("Situação atual é: " + contaReceber1.situacaoConta);
		}
		
		try {
			contaReceber2.receber();
		} catch (OperacaoContaException e) {
			System.out.println("\nErro!");
			System.out.println(e.getMessage());
			System.out.println("Situação atual é: " + contaReceber2.situacaoConta);
		}
	}
	
}
