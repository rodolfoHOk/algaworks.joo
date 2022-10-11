package com.algaworks.curso.joo.avancados.ordenacao;

import java.util.Arrays;
import java.util.List;

public class OrdenandoPelaIdade {
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Paulo", 36);
		Pessoa p2 = new Pessoa("José", 30);
		Pessoa p3 = new Pessoa("Maria", 27);
		
		List<Pessoa> pessoas = Arrays.asList(p1, p2, p3);
		
		IdadeComparator idadeComparator = new IdadeComparator();
//		Collections.sort(pessoas, idadeComparator); // java 7-
		pessoas.sort(idadeComparator); // java 8+
		
//		for (Pessoa pessoa : pessoas) { // java 7-
//			System.out.println(pessoa);
//		}
		
		pessoas.forEach(System.out::println); // Java 8+
		
	}
}
