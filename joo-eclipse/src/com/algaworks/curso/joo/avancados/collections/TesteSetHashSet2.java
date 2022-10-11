package com.algaworks.curso.joo.avancados.collections;

import java.util.Set;

public class TesteSetHashSet2 {

	public static void main(String[] args) {
		Set<Aluno> alunos = SimuladorBancoDeDados.buscarAlunos();
		
		Aluno alunoSorteado = new Aluno("Patricia");
		if (alunos.contains(alunoSorteado)) {
			System.out.println("Parabéns " + alunoSorteado.getNome() + "! Você foi sorteado(a)!");
		} else {
			System.out.println("Aluno não cadastrado no banco de dados.");
		}
	}
	
	public static void imprimirAlunos(Set<Aluno> alunos) {
		for (Aluno a : alunos) {
			System.out.println("Nome: " + a.getNome());
		}
	}

}
