package com.algaworks.curso.joo.avancados.datas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteDatas {

	public static void main(String[] args) {
		Date hoje = new Date();
		System.out.println(hoje);
		
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formatador.format(hoje));
		
		DateFormat formatador2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(formatador2.format(hoje));
		
		String dataAniversario = "18/06/1980";
		DateFormat formatador3 = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date aniversario = formatador3.parse(dataAniversario);
			System.out.println(formatador2.format(aniversario));
		} catch (ParseException e) {
			System.out.println("Formato de data inválido");
		}
	}
	
}
