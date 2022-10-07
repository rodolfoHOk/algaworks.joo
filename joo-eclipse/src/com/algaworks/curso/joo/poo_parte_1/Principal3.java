package com.algaworks.curso.joo.poo_parte_1;

public class Principal3 {

	public static void main(String[] args) {
		Proprietario dono1 = new Proprietario();
		dono1.nome = "João da Silva";
		dono1.cpf = "123.456.789-01";
		dono1.idade = 25;
		dono1.logradouro = "Rua das Gaivotas, 101";
		dono1.bairro = "Moema";
		dono1.cidade = "São Paulo";
		dono1.estado = "São Paulo";
		
		Carro carro1 = new Carro();
		carro1.fabricante = "Fiat";
		carro1.modelo = "Palio";
		carro1.cor = "Prata";
		carro1.anoDeFabricacao = 2022;
		carro1.biCombustivel = true;
		carro1.proprietario = dono1;
		
		Carro carro2 = new Carro();
		carro2.fabricante = "Honda";
		carro2.modelo = "Fit";
		carro2.cor = "Branco";
		carro2.anoDeFabricacao = 2020;
		carro2.biCombustivel = true;
		carro2.proprietario = dono1;
		
		System.out.println("Antes da Mudança");
		System.out.println("carro1.proprietario.nome: " + carro1.proprietario.nome);
		System.out.println("carro2.proprietario.nome: " + carro2.proprietario.nome);
		System.out.println("dono1.nome: " + dono1.nome);
		
		carro1.proprietario.nome = "Maria Joaquina";
		
		System.out.println();
		
		System.out.println("Depois da Mudança");
		System.out.println("carro1.proprietario.nome: " + carro1.proprietario.nome);
		System.out.println("carro2.proprietario.nome: " + carro2.proprietario.nome);
		System.out.println("dono1.nome: " + dono1.nome);
		
	}
	
}
