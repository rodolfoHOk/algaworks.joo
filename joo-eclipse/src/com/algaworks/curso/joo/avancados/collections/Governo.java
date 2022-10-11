package com.algaworks.curso.joo.avancados.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Governo {

	private Map<String, List<Politico>> partidosPoliticos;

	public Governo() {
		this.partidosPoliticos = new HashMap<String, List<Politico>>();
	}

	public void adicionarPolitico(String partidoPolitico, Politico politico) {
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		
		if (politicos == null) {
			politicos = new ArrayList<Politico>();
		}
		
		politicos.add(politico);
		
		this.partidosPoliticos.put(partidoPolitico, politicos);
	}

	public BigDecimal calcularGastosComSalario(String partidoPolitico) {
		List<Politico> politicosDoPartido = this.partidosPoliticos.get(partidoPolitico);
		BigDecimal somaSalarios = BigDecimal.ZERO;
		if (politicosDoPartido != null) {
			for (Politico politico : politicosDoPartido) {
				somaSalarios = somaSalarios.add(politico.getCargo().getSalario());
			}
		}
		return somaSalarios;
	}
	
	public BigDecimal calcularGastosComSalarioParaCargo(Cargo cargo, String partidoPolitico) {
		List<Politico> politicosDoPartido = this.partidosPoliticos.get(partidoPolitico);
		BigDecimal somaSalariosParaOCargo = BigDecimal.ZERO;
		if (politicosDoPartido != null) {
			for (Politico politico : politicosDoPartido) {
				if (politico.getCargo().equals(cargo)) {
					somaSalariosParaOCargo = somaSalariosParaOCargo.add(politico.getCargo().getSalario());
				}
			}
		}
		return somaSalariosParaOCargo;
	}
}
