package com.algaworks.curso.joo.poo_parte_2.polimorfismo;

public class TestePolimorfismo {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setSaldo(4000);
		imprimirSaldo(conta);
		
//		ContaCorrente contaCorrente = new ContaCorrente();
		Conta contaCorrente = new ContaCorrente();
		contaCorrente.setSaldo(3500);
//		contaCorrente.getLimite();
		imprimirSaldo(contaCorrente);
		
//		ContaPoupanca contaPoupanca = new ContaPoupanca();
		Conta contaPoupanca = new ContaPoupanca();
		contaPoupanca.setSaldo(2000);
		imprimirSaldo(contaPoupanca);
		
	}
	
	public static void imprimirSaldo(Conta conta) {
		System.out.println("\nSaldo da conta R$" + conta.getSaldo());
		
		if (conta instanceof ContaCorrente) {
			ContaCorrente cc = (ContaCorrente) conta;
			System.out.println("O limite da conta corrente é R$" + cc.getLimite());			
		}
		
		if (conta instanceof ContaPoupanca) {
			ContaPoupanca cp = (ContaPoupanca) conta;
			System.out.println("O rendimento da conta poupança é R$" + cp.getRendimentos());	
		}
	}
	
}
