package com.algaworks.curso.joo.jar;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Classe que representa o governo.
 * Mapeia os políticos do governo pelo partido político
 * 
 * @author rodolfo
 *
 */
public class Governo {

	private Map<String, List<Politico>> partidosPoliticos;

	public Governo() {
		this.partidosPoliticos = new HashMap<String, List<Politico>>();
	}

	/**
	 * Método para adicionar um político ao governo
	 * 
	 * @param partidoPolitico A sigla do partido político
	 * @param politico O político a adicionar
	 */
	public void adicionarPolitico(String partidoPolitico, Politico politico) {
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		
		if (politicos == null) {
			politicos = new ArrayList<Politico>();
		}
		
		politicos.add(politico);
		
		this.partidosPoliticos.put(partidoPolitico, politicos);
	}

	/**
	 * Método para calcular os gastos do governo com salários de um determinado partido político
	 * 
	 * @param partidoPolitico A sigla do partido político
	 * @return Retorna a soma dos salários dos políticos do partido
	 */
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
	
	/**
	 * Método para calcular os gastos do governo com salários de um determinado cargo e partido político
	 * 
	 * @param cargo O cargo político
	 * @param partidoPolitico A sigla do partido político
	 * @return Retorna a soma dos salários dos políticos do partido em um determinado cargo
	 */
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
