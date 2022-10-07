package com.algaworks.curso.joo.wrappers_boxing_arrays;

public class Estoque {
	
	Produto[] produtos;
	int totalDeItems = 0;
	
	void listarProdutos() {
		System.out.println("\nProdutos em estoque");
		System.out.println("----------------------");
		
		for (int i = 0; i < produtos.length; i++) {
			produtos[i].descrever();
			totalDeItems += produtos[i].quantidade;
		}
		
	}

}
