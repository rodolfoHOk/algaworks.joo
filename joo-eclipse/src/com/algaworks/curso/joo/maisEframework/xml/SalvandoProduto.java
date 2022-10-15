package com.algaworks.curso.joo.maisEframework.xml;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.BigDecimal;

import com.algaworks.curso.joo.maisEframework.xml.modelo.Produto;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class SalvandoProduto {

	public static void main(String[] args) {
		XStream xStream = new XStream(new DomDriver());
		xStream.alias("produto", Produto.class);
		
		Produto sabonete = new Produto(1L, "sabonete", new BigDecimal("2.30"));
		
		String xml = xStream.toXML(sabonete);
		System.out.println(xml);
		
		try {
			OutputStream os = new FileOutputStream("./produto1.xml");
			xStream.toXML(sabonete, os);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		xStream.aliasAttribute(Produto.class, "codigo", "codigo");
		try {
			OutputStream os = new FileOutputStream("./produto2.xml");
			xStream.toXML(sabonete, os);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}		
		
	}
	
}
