package com.algaworks.curso.joo.poo_parte_2.interfaces.caixa;

import com.algaworks.curso.joo.poo_parte_2.interfaces.impressao.Impressora;
import com.algaworks.curso.joo.poo_parte_2.interfaces.pagamento.Cartao;
import com.algaworks.curso.joo.poo_parte_2.interfaces.pagamento.Operadora;

public class Checkout {
	
	private Operadora operadora;
	private Impressora impressora;
	
	public Checkout(Operadora operadora, Impressora impressora) {
		super();
		this.operadora = operadora;
		this.impressora = impressora;
	}
	
	public void fecharCompra(Compra compra, Cartao cartao) {
		boolean autorizado = this.operadora.autorizar(compra, cartao);
		
		if (autorizado) {
			this.impressora.imprimir(compra);
		} else {
			System.out.println("Pagamento foi negado!");
		}
	}

}
