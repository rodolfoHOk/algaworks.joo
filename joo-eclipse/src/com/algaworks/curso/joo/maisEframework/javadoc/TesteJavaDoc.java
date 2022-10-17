package com.algaworks.curso.joo.maisEframework.javadoc;

import com.algaworks.curso.joo.maisEframework.javadoc.modelo.Funcionario;

public class TesteJavaDoc {

	public static void main(String[] args) {
		Funcionario funcionarioTesteDepreciado = new Funcionario("João Carvalho");
		funcionarioTesteDepreciado.setSalario(4000);
		
		Funcionario funcionario = new Funcionario("João Carvalho", 3000);
		double adiantamentoDeViagem = funcionario.adiantamentoDeViagem(5, true);
		System.out.println("Adiantamento: " + adiantamentoDeViagem);
	}
	
}
