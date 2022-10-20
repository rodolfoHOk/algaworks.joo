package com.algaworks.curso.joo.novidades8.interfacesFuncionais;

import com.algaworks.curso.joo.novidades8.interfacesFuncionais.compras.Compra;
import com.algaworks.curso.joo.novidades8.interfacesFuncionais.impressao.Impressora;
//import com.algaworks.curso.joo.novidades8.interfacesFuncionais.impressao.impressoras.ImpressoraHP;

public class TesteImpressoras {

	public static void main(String[] args) {
		
//		Impressora hp = new ImpressoraHP();
		
		// obs: posso criar expressões lambda para interfaces funcionais
//		Impressora hp = () -> { // Exemplo 1
//			System.out.println("Simulando impressão");
//			System.out.println();
//		};
		
		Impressora hp = compra -> { // Exemplo 2
			System.out.println("Simulando impressão");
			System.out.println("Imprimindo: " + compra);
		};
		
		hp.imprimir(new Compra("sabonete", 2.15));
	}
	
}
