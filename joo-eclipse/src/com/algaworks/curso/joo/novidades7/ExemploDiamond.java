package com.algaworks.curso.joo.novidades7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ExemploDiamond {

	public static void main(String[] args) {
//		List<String> nomesClientes = new ArrayList<String>(); // antes Java 7
		List<String> nomesClientes = new ArrayList<>(); // Java 7
		nomesClientes.add("João");
		nomesClientes.add("José");
		nomesClientes.add("Maria");
//		nomesClientes.add(1); // não permite
		
		Map<String, Set<String>> carroPorMontadora = new HashMap<>();
		carroPorMontadora.put("Chevrolet", new HashSet<String>());
		carroPorMontadora.get("Chevrolet").add("Onix");
		
		@SuppressWarnings("unused")
		Set<String> carrosDaVolkswagen;
		carroPorMontadora.put("Volkswagen", carrosDaVolkswagen = new HashSet<>());
		carroPorMontadora.get("Volkswagen").add("Gol");
		
	}
	
}
