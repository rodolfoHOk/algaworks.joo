package com.algaworks.curso.joo.maisEframework.generics;

import java.util.List;

public class RetiraElementos {
	
//	public static Object recuperaPrimeiro(List lista) { // sem generic
	public static <T> T recuperaPrimeiro(List<T> lista) { // com generic no método
		return lista.get(0);
	}

}
