package poo.parte2;

public class Pessoa {

	String nome;
	int idade;
	
	Pessoa(String nome) {
		this.nome = nome;
		// inicialização bem complicada de fazer...
	}
	
	Pessoa(String nome, int idade) {
		// this.nome = nome;
		this(nome); // Deve ser a primeira instrução dentro do construtor
		this.idade = idade;
	}
	
}
