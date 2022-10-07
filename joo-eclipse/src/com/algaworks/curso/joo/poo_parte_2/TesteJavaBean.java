package com.algaworks.curso.joo.poo_parte_2;

public class TesteJavaBean {

	public static void main(String[] args) {
		
		PessoaBean pessoa = new PessoaBean();
		pessoa.setNome("José");
		pessoa.setIdade(35);
		
		System.out.println(pessoa.getNome() + " tem " + pessoa.getIdade() + " anos");
		
	}
	
}
