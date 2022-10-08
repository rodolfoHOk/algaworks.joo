package com.algaworks.curso.joo.poo_parte_2.interfaces.impressao.impressoras;

import com.algaworks.curso.joo.poo_parte_2.interfaces.impressao.Impressora;
import com.algaworks.curso.joo.poo_parte_2.interfaces.impressao.Imprimivel;

public class ImpressoraEpson implements Impressora {

	@Override
	public void imprimir(Imprimivel imprimivel) {
		System.out.println("* * * * * * * * * * * * * * * * * * * *");
		System.out.println(imprimivel.getCabecalhoPagina());
		System.out.println("* * * * * * * * * * * * * * * * * * * *");
		System.out.println(imprimivel.getCorpoPagina());
		System.out.println();
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("==               EPSON              ==");
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");
	}

}
