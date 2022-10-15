package com.algaworks.curso.joo.maisEframework.xml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.algaworks.curso.joo.maisEframework.xml.modelo.Produto;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class LendoProduto {

	public static void main(String[] args) {
		XStream xStream = new XStream(new DomDriver());
		xStream.alias("produto", Produto.class);
		xStream.aliasAttribute(Produto.class, "codigo", "codigo");
		
		xStream.allowTypes(new Class[] {Produto.class});
		
		try {
			Produto p = (Produto) xStream.fromXML(new FileInputStream("./produto2.xml"));
			System.out.println(p);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
