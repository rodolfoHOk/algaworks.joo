package com.algaworks.curso.joo.poo_parte_1;

public class Principal6 {
	
	public static void main(String[] args) {
		FolhaDePagamento folha = new FolhaDePagamento();
		
		double salario = folha.calcularSalario(160, 12, 30.2, 45.4);
		
		System.out.println("Salario: " + salario);
		
	}
	
}
