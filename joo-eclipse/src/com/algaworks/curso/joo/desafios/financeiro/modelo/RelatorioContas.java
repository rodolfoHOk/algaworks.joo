package com.algaworks.curso.joo.desafios.financeiro.modelo;

public class RelatorioContas {

	public void exibirListagem(Conta[] contas) {
		for (Conta c : contas) {
			c.exibirDetalhes();
			System.out.println();
		}
	}
}
