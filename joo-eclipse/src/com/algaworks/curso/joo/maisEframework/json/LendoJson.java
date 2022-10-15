package com.algaworks.curso.joo.maisEframework.json;

import com.algaworks.curso.joo.maisEframework.json.modelo.Cliente;
import com.google.gson.Gson;

public class LendoJson {
	
	public static void main(String[] args) {
		String json = "{\"nome\":\"João dos Santos\",\"idade\":31,\"endereco\":{\"logradouro\":\"Ruas das Gaivotas, 10\",\"cidade\":\"São Paulo\",\"estado\":\"SP\"},\"telefones\":[{\"tipo\":\"RESIDENCIAL\",\"numero\":\"11 3333-4567\"},{\"tipo\":\"COMERCIAL\",\"numero\":\"11 4444-5678\"}]}";
	
		Gson gson = new Gson();
		Cliente cliente = gson.fromJson(json, Cliente.class);
		
		System.out.println(cliente);
	}
}
