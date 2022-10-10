package com.algaworks.curso.joo.avancados.excecoes;

public class TesteExcecoesChecadas {
	
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(1000);
		
		try {
			cc.sacar(600);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());	
		}
		System.out.println("Saldo: " + cc.getSaldo());
		
		try {
			cc.sacar(500);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());	
		} finally {
			System.out.println("Obrigado por utilizar nosso sistema!");
		}
		System.out.println("Saldo: " + cc.getSaldo());
		
	}
	
}
