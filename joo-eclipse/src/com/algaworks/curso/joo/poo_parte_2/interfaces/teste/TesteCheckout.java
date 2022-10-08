package com.algaworks.curso.joo.poo_parte_2.interfaces.teste;

import com.algaworks.curso.joo.poo_parte_2.interfaces.caixa.Checkout;
import com.algaworks.curso.joo.poo_parte_2.interfaces.caixa.Compra;
import com.algaworks.curso.joo.poo_parte_2.interfaces.impressao.Impressora;
import com.algaworks.curso.joo.poo_parte_2.interfaces.impressao.impressoras.ImpressoraEpson;
import com.algaworks.curso.joo.poo_parte_2.interfaces.impressao.impressoras.ImpressoraHP;
import com.algaworks.curso.joo.poo_parte_2.interfaces.pagamento.Cartao;
import com.algaworks.curso.joo.poo_parte_2.interfaces.pagamento.Operadora;
import com.algaworks.curso.joo.poo_parte_2.interfaces.pagamento.operadoras.Cielo;
import com.algaworks.curso.joo.poo_parte_2.interfaces.pagamento.operadoras.RedeCard;

public class TesteCheckout {

	public static void main(String[] args) {
//		Operadora operadora = new Cielo();
		Operadora operadora = new RedeCard();
//		Impressora impressora = new ImpressoraEpson();
		Impressora impressora = new ImpressoraHP();
		
		Cartao cartao = new Cartao();
		cartao.setNomeTitular("João V dos Brocolis");
		cartao.setNumeroCartao("1256-5678-1234-5678");
		
		Compra compra = new Compra();
		compra.setNomeCliente("João Vitorino dos Brocolis");
		compra.setProduto("Detergente 1L");
		compra.setValorTotal(2.15);
		
		Checkout checkout = new Checkout(operadora, impressora);
		checkout.fecharCompra(compra, cartao);
	}
	
}
