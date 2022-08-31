// São bissextos todos os anos múltiplos de 400, por exemplo: 1600, 2000, 2400, ...
// São bissextos todos os múltiplos de 4 e não múltiplos de 100, por exemplo: 1996, 2004, 2008, 2012, ...
// Não são bissextos todos os demais anos.

import java.util.Scanner;

public class DescobreAnoBissexto {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ano: ");
		int ano = entrada.nextInt();
		
		if (ano % 400 == 0) { // todos os anos múltiplos de 400
			System.out.println("O ano \"" + ano + "\" é um ano bissexto"); 
		} else if (ano % 4 == 0) {
			if (ano % 100 != 0) { // todos os múltiplos de 4 e não múltiplos de 100
				System.out.println("O ano \"" + ano + "\" é um ano bissexto"); 			
			} else {
				System.out.println("O ano \"" + ano + "\" não é um ano bissexto"); 
			}		
		} else {
			System.out.println("O ano \"" + ano + "\" não é um ano bissexto");
		}
		
	}

}
