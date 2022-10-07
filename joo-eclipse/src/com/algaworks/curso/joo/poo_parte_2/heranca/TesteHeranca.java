package com.algaworks.curso.joo.poo_parte_2.heranca;

public class TesteHeranca {
	
	public static void main(String[] args) {
		Jogador j = new Jogador();
		j.nome = "Ronaldo";
		j.idade = 19;
		j.seApresentar();
		j.respondeSeAindaJoga();
		
		Pessoa p = new Pessoa();
		p.nome = "Ronaldo";
		p.idade = 19;
		p.seApresentar();
		// p.respondeSeAindaJoga(); // não possui este método
		
	}
	
}
