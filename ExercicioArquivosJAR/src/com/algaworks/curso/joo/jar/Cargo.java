package com.algaworks.curso.joo.jar;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Esta classe representa o cargo de um polílico.
 * Descreve o cargo e seu salário
 * 
 * @author rodolfo
 *
 */
public class Cargo {
	
	private String descricao;
	private BigDecimal salario;
	
	/**
	 * Método para pegar a descrição do cargo
	 * 
	 * @return Retorna a descrição do cargo
	 */
	public String getDescricao() {
		return this.descricao;
	}
	
	/**
	 * Método para setar a descrição do cargo
	 * 
	 * @param descricao A descrição do cargo
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	/**
	 * Método para pegar o salário do cargo
	 * 
	 * @return Retorna o salário do cargo
	 */
	public BigDecimal getSalario() {
		return this.salario;
	}
	
	/**
	 * Método para seta o salário do cargo
	 * 
	 * @param salario O salário do cargo
	 */
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cargo other = (Cargo) obj;
		return Objects.equals(descricao, other.descricao);
	}
	
}
