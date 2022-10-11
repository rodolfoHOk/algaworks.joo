package com.algaworks.curso.joo.avancados.collections;

import java.util.HashSet;
import java.util.Set;

public class SimuladorBancoDeDados {

	public static Set<Aluno> buscarAlunos() {
		Set<Aluno> alunos = new HashSet<Aluno>();
		alunos.add(new Aluno("Teresa"));
		alunos.add(new Aluno("Patricia"));
		alunos.add(new Aluno("Rafael"));
		
		return alunos;
	}
	
}
