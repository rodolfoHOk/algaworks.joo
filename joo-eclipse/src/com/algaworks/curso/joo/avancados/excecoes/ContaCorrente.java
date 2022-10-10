package com.algaworks.curso.joo.avancados.excecoes;

public class ContaCorrente {

	private double saldo;
	
	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double deposito) {
		if (deposito <= 0) {
			throw new IllegalArgumentException("O valor de deposito não pode ser menor que zero!");
		}
		this.saldo += deposito;
	}
	
	public void sacar(double quantidade) throws SaldoInsuficienteException {
		if (quantidade > this.saldo) {
			throw new SaldoInsuficienteException("Você não posssui saldo suficiente!");
		}
		this.saldo -= quantidade;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
}
