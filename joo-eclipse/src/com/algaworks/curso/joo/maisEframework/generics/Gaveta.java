package com.algaworks.curso.joo.maisEframework.generics;

import java.util.ArrayList;
import java.util.List;

public class Gaveta<T> {
	
	private String tag;
	private List<T> colecao;
	
	public Gaveta(String tag) {
		this.tag = tag;
		this.colecao = new ArrayList<>();
	}

	public void colocar(T t) {
		colecao.add(t);
	}
	
	public T retirarPrimeiro() {
		if (colecao.size() == 0) {
			return null;
		}
		return colecao.remove(0);
	}

	public String getTag() {
		return tag;
	}
	
}
