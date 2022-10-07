package com.algaworks.curso.joo.poo_parte_2.abstrata;

public class ProdutoPerecivel extends Produto {
	
	String dataValidade;

	@Override
	public void imprimirDescricao() {
		System.out.println("Descrição: " + super.getDescricao() + ". Vencimento: " + dataValidade);		
	}

}
