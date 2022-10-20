package com.algaworks.curso.joo.novidades8.datas.aluguelCarro.exemplos;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import com.algaworks.curso.joo.novidades8.datas.aluguelCarro.model.Cliente;

public class CadastroCliente {
	
	public static void main(String[] args) {

//		Calendar c = Calendar.getInstance();
//		c.set(Calendar.YEAR, 1980);
//		c.set(Calendar.MONTH, 5);
//		c.set(Calendar.DAY_OF_MONTH, 18);
//		Date dataNascimento = c.getTime();
		
		LocalDate dataNascimento = LocalDate.of(2000, Month.JUNE, 15);
		
		Cliente cliente = new Cliente("João Santos", dataNascimento);
		System.out.println(cliente);		
		
//		Calendar nascimento = Calendar.getInstance();
//		nascimento.set(Calendar.YEAR, 1980);
//		nascimento.set(Calendar.MONTH, 5);
//		nascimento.set(Calendar.DAY_OF_MONTH, 18);
//		Calendar hoje = Calendar.getInstance();
//		long tempoEmMiliSegundos = hoje.getTimeInMillis() - idade.getTimeInMillis();
//		long idade = tempoEmMiliSegundos / 1000 / 60 / 60 / 24 / 365;

		int idade = Period.between(dataNascimento, LocalDate.now()).getYears();
		
		if (idade >= 18) {
			System.out.println("Ok pode ser cadastrado. Idade: " + idade);
		} else {
			System.out.println("Menor não pode ser cadastrado! Idade: " + idade);
		}
		
	}
	
}
