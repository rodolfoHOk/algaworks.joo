package com.algaworks.curso.joo.poo_parte_2.sobreposicao;

import java.util.Date;

public class TesteSobreposicao {

	public static void main(String[] args) {
		ProdutoPerecivel pp = new ProdutoPerecivel();
		pp.descricao = "Iogurte Natural";
		pp.dataValidade = new Date();
		pp.identificar();
	}
	
}
