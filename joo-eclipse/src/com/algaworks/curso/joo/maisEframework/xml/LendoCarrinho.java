package com.algaworks.curso.joo.maisEframework.xml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import com.algaworks.curso.joo.maisEframework.xml.modelo.Produto;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class LendoCarrinho {

	public static void main(String[] args) {
		XStream xStream = new XStream(new DomDriver());
		xStream.alias("produto", Produto.class);
		xStream.aliasAttribute(Produto.class, "codigo", "codigo");
		xStream.alias("carrinho", List.class);
		xStream.allowTypes(new Class[] {Produto.class, List.class});
		
		try {
			@SuppressWarnings("unchecked")
			List<Produto> carrinho = (List<Produto>) xStream.fromXML(new FileInputStream("./carrinho.xml"));
			for (Produto p : carrinho) {
				System.out.println(p);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
