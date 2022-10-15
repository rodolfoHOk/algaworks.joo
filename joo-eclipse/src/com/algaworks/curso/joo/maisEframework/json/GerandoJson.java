package com.algaworks.curso.joo.maisEframework.json;

import java.util.Arrays;
import java.util.List;

import com.algaworks.curso.joo.maisEframework.json.modelo.Cliente;
import com.algaworks.curso.joo.maisEframework.json.modelo.Endereco;
import com.algaworks.curso.joo.maisEframework.json.modelo.Telefone;
import com.google.gson.Gson;

public class GerandoJson {

	public static void main(String[] args) {
		Endereco endereco = new Endereco("Ruas das Gaivotas, 10", "São Paulo", "SP");
		Telefone residencial = new Telefone("RESIDENCIAL", "11 3333-4567");
		Telefone comercial = new Telefone("COMERCIAL", "11 4444-5678");
		List<Telefone> telefones = Arrays.asList(residencial, comercial);
		
		Cliente cliente = new Cliente("João dos Santos", 31, endereco, telefones);
		
		Gson gson = new Gson();
		String json = gson.toJson(cliente);
		
		System.out.println(json);
	}
	
}
