package com.algaworks.curso.joo.novidades8.interfacesFuncionais.impressao;

import com.algaworks.curso.joo.novidades8.interfacesFuncionais.compras.Compra;

// Isso é uma interface funcional: uma interface que só tem um método 
// obs: funciona para interfaces criadas antes do Java 8 também

@FunctionalInterface // anotação para proibir adição de novos métodos
public interface Impressora {

//	public void imprimir(); // Exemplo 1
	public void imprimir(Compra c); // Exemplo 2
	
//	public void desligar(long agendamento); // anotação na inferface não permite
	
}
