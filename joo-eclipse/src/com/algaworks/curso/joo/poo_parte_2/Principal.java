package com.algaworks.curso.joo.poo_parte_2;

public class Principal {

	public static void main(String[] args) {
		
		Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setNome("Kaisen Negócios Imobiliários");
		
		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado R&R");
		
		ContaPagar conta1 = new ContaPagar();
		conta1.setDescricao("Aluguel da Matriz");
		conta1.setValor(1230d);
		conta1.setDataVencimento("10/09/2022");
		conta1.setFornecedor(imobiliaria);
		
		ContaPagar conta2 = new ContaPagar(mercado, "Compra do mês", 390d, "25/09/2022");
		ContaPagar conta3 = new ContaPagar(imobiliaria, "Aluguel da filial", 700d, "15/09/2022");
		
		conta1.pagar();
		conta2.pagar();
		conta3.pagar();
		
	}
}
