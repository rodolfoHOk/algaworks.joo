package com.algaworks.curso.joo.desafios.seguradora.modelo;

public class Principal {

	public static void main(String[] args) {
		CorretoraSeguros corretora = new CorretoraSeguros();
		
		Carro meuCarro = new Carro(45000d, 2012);
		Imovel minhaCasa = new Imovel(920000, 320);
		
		corretora.fazerPropostaSeguro(meuCarro);
		corretora.fazerPropostaSeguro(minhaCasa);
		
		Notebook notebookXYZ = new Notebook(3600, 2019);
		corretora.fazerPropostaSeguro(notebookXYZ);
		
		Barco meuBarco = new Barco(250000, 30);
		corretora.fazerPropostaSeguro(meuBarco);
	}
	
}
