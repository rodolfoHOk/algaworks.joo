package com.algaworks.curso.joo.poo_parte_2.sobrecarga;

public class TesteMaquinaCafe {

	public static void main(String[] args) {
		MaquinaCafe maquina = new MaquinaCafe();
		maquina.acucarDisponivel = 30;
		
		maquina.fazerCafe();
		
		maquina.fazerCafe(25);
		
		maquina.acucarDisponivel = 100;
		maquina.fazerCafe(25);
		maquina.fazerCafe(10);
		
	}
	
}
