package com.algaworks.curso.joo.novidades7;

public class SwitchCaseComString {

	public static void main(String[] args) {
		String carro = "Audi";
		
		// Antes Java 7
//		if (carro.equals("Audi")) {
//			System.out.println("Alemão");
//		} else if (carro.equals("Ferrari")) {
//			System.out.println("Italiano");		
//		} else if (carro.equals("Honda")) {
//			System.out.println("Japonês"); {		
//		}
		
		// Java 7
		switch(carro) {
		case "Audi":
			System.out.println("Alemão");
			break;
		case "Ferrari":
			System.out.println("Italiano");
			break;
		case "Honda":
			System.out.println("Japonês");
			break;
		case "Ford":
			System.out.println("Americano");
			break;
		default:
			System.out.println("Indefinido");
		}
			
	}
	
}
