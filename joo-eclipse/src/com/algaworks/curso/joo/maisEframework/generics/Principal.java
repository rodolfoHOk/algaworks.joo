package com.algaworks.curso.joo.maisEframework.generics;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
//		List funcionarios = new ArrayList(); // sem generic
		List<Funcionario> funcionarios = new ArrayList<>(); // com generic
		
		funcionarios.add(new Funcionario("João"));
		funcionarios.add(new Funcionario("Maria"));
		
//		funcionarios.add("Camila"); // sem generic é permitido e com generic não é permitido
		funcionarios.add(new Funcionario("Camila"));
		
//		for (int i = 0; i < funcionarios.size(); i++) { 
		for (Funcionario f : funcionarios) { // com generic posso usar o for desta forma
//			Funcionario f = (Funcionario) funcionarios.get(i); // sem generic precisa do cast
//			Funcionario f = funcionarios.get(i); // com generic não precisa do cast 
			// com for novo não precisamos mais da linha acima
			
			System.out.println("Nome do funcionário: " + f.getNome());
		}
	}
	
}
