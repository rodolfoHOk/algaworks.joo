package com.algaworks.curso.joo.novidades7;

public class SalvarAluno {

	public static void salvar(String nome, String idade) {
		if (nome == null || nome.trim().equals("")) {
			throw new NegocioException("Nome é obrigatório");
		}
				
		int i = Integer.parseInt(idade);
		
		System.out.println("Salvando aluno " + nome + " " + i + "...");
		
	}

}
