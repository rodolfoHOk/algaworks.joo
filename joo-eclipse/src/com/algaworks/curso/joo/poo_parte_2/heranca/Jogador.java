package com.algaworks.curso.joo.poo_parte_2.heranca;

public class Jogador extends Pessoa {

	protected boolean aindaJoga = false;
	
	public void respondeSeAindaJoga() {
		System.out.println("Ainda joga? " + aindaJoga);
	}
	
}
