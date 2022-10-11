package com.algaworks.curso.joo.avancados.collections;

import java.util.HashMap;
import java.util.Map;

public class TesteMapHashMap {
	
	public static void main(String[] args) {
		Aluno a1 = new Aluno("João");
		Aluno a2 = new Aluno("José");
		Aluno a3 = new Aluno("Maria");
		Aluno a4 = new Aluno("Pedro");
		
		Map<String, Aluno> alunos = new HashMap<String, Aluno>(); // mapa <chave, valor>
		
		alunos.put("001", a1);
		alunos.put("002", a2);
		alunos.put("003", a3);
		alunos.put("004", a4);
		alunos.put("005", a3);
		
		imprimirAlunos(alunos);
		
		Aluno alunoChave003 = alunos.get("003");
		
		System.out.println("Aluno de chave 003: " + alunoChave003.getNome()); // recupera pela chave
		
	}

	private static void imprimirAlunos(Map<String, Aluno> alunos) {
		for (Aluno a : alunos.values()) {
			System.out.println("Nome: " + a.getNome());
		}
	}
	
}
