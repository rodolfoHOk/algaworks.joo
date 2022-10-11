package com.algaworks.curso.joo.avancados.ordenacao;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenandoPeloNome {
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Paulo", 36);
		Pessoa p2 = new Pessoa("José", 30);
		Pessoa p3 = new Pessoa("Maria", 27);
		
		List<Pessoa> pessoas = Arrays.asList(p1, p2, p3);
		
		Collections.sort(pessoas);
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
		
	}
	
}
