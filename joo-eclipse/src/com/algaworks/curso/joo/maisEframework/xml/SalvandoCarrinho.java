package com.algaworks.curso.joo.maisEframework.xml;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.algaworks.curso.joo.maisEframework.xml.modelo.Produto;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class SalvandoCarrinho {

	public static void main(String[] args) {
		List<Produto> carrinho = new ArrayList<>();
		carrinho.add(new Produto(1L, "sabonete", new BigDecimal("2.30")));
		carrinho.add(new Produto(2L, "shampoo", new BigDecimal("8.20")));
		carrinho.add(new Produto(3L, "pasta de dente", new BigDecimal("2.80")));
		
		XStream xStream = new XStream(new DomDriver());
		xStream.alias("produto", Produto.class);
		xStream.aliasAttribute(Produto.class, "codigo", "codigo");
		xStream.alias("carrinho", List.class);
		
		try {
			OutputStream os = new FileOutputStream("./carrinho.xml");
			xStream.toXML(carrinho, os);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
