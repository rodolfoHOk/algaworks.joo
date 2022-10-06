package com.algaworks.curso.fjoo.enums;

public class Carta {

	private int numero;
	private Naipe naipe;
	
	public Carta(int numero, Naipe naipe) {
		super();
		this.numero = numero;
		this.naipe = naipe;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Naipe getNaipe() {
		return naipe;
	}

	public void setNaipe(Naipe naipe) {
		this.naipe = naipe;
	}
	
	public void imprimirCarta() {
		System.out.println("Sou " + numero + " de " + naipe + ". E tenho a cor: " + naipe.getCor());
	}
	
}
