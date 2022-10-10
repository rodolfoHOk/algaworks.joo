package com.algaworks.curso.joo.avancados.datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteCalendar {
	
	public static void main(String[] args) {
		Calendar c = new GregorianCalendar();
		
		c.set(Calendar.DAY_OF_MONTH, 15);
		c.set(Calendar.MONTH, 7); // começando do 0 a 11
		c.set(Calendar.YEAR, 2020);
		c.set(Calendar.HOUR_OF_DAY, 10);
		c.set(Calendar.MINUTE, 15);
		c.set(Calendar.SECOND, 59);
		
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(formatador.format(c.getTime()));
		
		c.add(Calendar.DAY_OF_MONTH, 17);
		System.out.println(formatador.format(c.getTime()));
		
		c.add(Calendar.DAY_OF_MONTH, -1);
		System.out.println(formatador.format(c.getTime()));
		
		c.add(Calendar.MONTH, 1);
		System.out.println(formatador.format(c.getTime()));
		
		c.roll(Calendar.DAY_OF_MONTH, 1);
		System.out.println(formatador.format(c.getTime()));
	}
	
}
