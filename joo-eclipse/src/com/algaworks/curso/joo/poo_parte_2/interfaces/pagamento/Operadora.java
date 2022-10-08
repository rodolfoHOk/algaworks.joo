package com.algaworks.curso.joo.poo_parte_2.interfaces.pagamento;

public interface Operadora {

	public boolean autorizar(Autorizavel autorizavel, Cartao cartao);
	
}
