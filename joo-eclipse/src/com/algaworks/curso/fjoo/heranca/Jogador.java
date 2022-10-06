package com.algaworks.curso.fjoo.heranca;

public class Jogador extends Pessoa {

	protected boolean aindaJoga = false;
	
	public void respondeSeAindaJoga() {
		System.out.println("Ainda joga? " + aindaJoga);
	}
	
}
