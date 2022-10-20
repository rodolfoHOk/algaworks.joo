package com.algaworks.curso.joo.novidades8.interfacesFuncionais.impressao.impressoras;

import com.algaworks.curso.joo.novidades8.interfacesFuncionais.compras.Compra;
import com.algaworks.curso.joo.novidades8.interfacesFuncionais.impressao.Impressora;

public class ImpressoraHP implements Impressora {

//	@Override // exemplo 1
//	public void imprimir() {
//		System.out.println("Enviando comando para a impressora HP");
//	}
	
	@Override
	public void imprimir(Compra c) {
		System.out.println("Enviando comando para a impressora HP -> " + c);	
	}

}
