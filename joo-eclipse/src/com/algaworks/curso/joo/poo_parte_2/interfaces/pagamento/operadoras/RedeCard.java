package com.algaworks.curso.joo.poo_parte_2.interfaces.pagamento.operadoras;

import com.algaworks.curso.joo.poo_parte_2.interfaces.pagamento.Autorizavel;
import com.algaworks.curso.joo.poo_parte_2.interfaces.pagamento.Cartao;
import com.algaworks.curso.joo.poo_parte_2.interfaces.pagamento.Operadora;

public class RedeCard implements Operadora {

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("1256") && 
				autorizavel.getValorTotal() > 0 && autorizavel.getValorTotal() < 200 ;
	}

}
