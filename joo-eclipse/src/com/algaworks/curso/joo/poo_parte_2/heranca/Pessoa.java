package com.algaworks.curso.joo.poo_parte_2.heranca;

public class Pessoa {

	protected String nome;
	protected int idade;
	
	public void seApresentar() {
		System.out.println("Olá, eu sou " + nome + ", e tenho " + idade + " anos");
	}
}
