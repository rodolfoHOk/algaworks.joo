package com.algaworks.curso.joo.avancados.collections;

import java.util.ArrayList;
import java.util.List;

public class TesteListArrayList {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("João");
		Aluno a2 = new Aluno("José");
		Aluno a3 = new Aluno("Maria");
		Aluno a4 = new Aluno("Pedro");
		
		List<Aluno> alunos = new ArrayList<Aluno>(); // ArrayList tem ordem de inserção
		
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		alunos.add(a3);
		
		imprimirAlunos(alunos);
		
		System.out.println("Aluno do índice 0: " + alunos.get(0).getNome());
		
	}
	
	public static void imprimirAlunos(List<Aluno> alunos) {
		for (Aluno a : alunos) {
			System.out.println("Nome: " + a.getNome());
		}
	}

}
