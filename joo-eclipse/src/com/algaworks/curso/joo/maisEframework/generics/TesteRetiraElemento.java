package com.algaworks.curso.joo.maisEframework.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TesteRetiraElemento {

	public static void main(String[] args) {
		List<String> nomes = Arrays.asList("João", "Maria");
		
//		String primeiroNome = (String) RetiraElementos.recuperaPrimeiro(nomes); sem generic
		String primeiroNome = RetiraElementos.recuperaPrimeiro(nomes); // com generic no método
		System.out.println(primeiroNome);
		
		// --------
		List<Funcionario> funcionarios = new ArrayList<>();
		funcionarios.add(new Funcionario("Reinaldo"));
		
		Funcionario f = RetiraElementos.recuperaPrimeiro(funcionarios);
		System.out.println(f.getNome());
		
	}
}
