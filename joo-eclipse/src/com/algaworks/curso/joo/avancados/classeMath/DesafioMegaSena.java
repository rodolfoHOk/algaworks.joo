package com.algaworks.curso.joo.avancados.classeMath;

public class DesafioMegaSena {
	
	public static void main(String[] args) {
		imprimeSequencias(6);
	}
	
	private static void imprimeSequencias(int numeroSequencias) {
		for (int i = numeroSequencias; i > 0; i--) {
			int[] novaSequencia = gerarSequencia();
			for (int n : novaSequencia) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}
	
	private static int[] gerarSequencia() {
		int[] sequencia = new int[6];
		int i = 0;
		while (i < 6) {
			int novoNumero =  gerarNumeroAleatorio();
			boolean jaExiste = false;
			for (int j = 0; j <= i; j++) {
				if (sequencia[j] == novoNumero) {
					jaExiste = true;
				}
			}
			if (!jaExiste) {
				sequencia[i] = novoNumero;
				i++;
			}
		}
		return sequencia;
	}

	private static int gerarNumeroAleatorio() {
		return (int) Math.ceil(Math.random() * 60);
	}
	
}
