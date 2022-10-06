package com.algaworks.curso.fjoo.sobrecarga;

public class TesteCadastro {
	
	public static void main(String[] args) {
		CadastroPessoa cadastro = new CadastroPessoa();
		
		Pessoa pessoa = new Pessoa("Maria", 36);
		cadastro.cadastrar(pessoa);
		
		cadastro.cadastrar("Rafaela", 15);		
	}
	
}
