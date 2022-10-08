package com.algaworks.curso.joo.poo_parte_2.interfaces.pagamento.operadoras;

import com.algaworks.curso.joo.poo_parte_2.interfaces.pagamento.Autorizavel;
import com.algaworks.curso.joo.poo_parte_2.interfaces.pagamento.Cartao;
import com.algaworks.curso.joo.poo_parte_2.interfaces.pagamento.Operadora;

public class Cielo implements Operadora {

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("1234") && 
				autorizavel.getValorTotal() > 0 && autorizavel.getValorTotal() < 100 ;
	}

}
