/* IMC para sexo Feminino
	abaixo do peso: menor que 19.1
	peso ideal: 19.1 a 25.8
	pouco acima do peso: 25.9 a 27.3
	acima do peso ideal: 27.4 a 32.3
	obeso: maior que 32.3
*/
/* IMC para sexo Masculino
	abaixo do peso: menor que 20.7
	peso ideal: 20.8 a 26.4
	pouco acima do peso: 26.5 a 27.8
	acima do peso ideal: 27.9 a 31.1
	obeso: maior que 31.1
*/

import java.util.Scanner;
import java.util.Locale;

public class OperadoresLogicos {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US);
		
		System.out.print("Nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Peso: ");
		int peso = entrada.nextInt();
		
		System.out.print("Altura: ");
		double altura = entrada.nextDouble();
		
		System.out.print("Sexo (1 para 'M' ou outro numero para 'F'): ");
		char sexo = entrada.nextShort() == 1 ? 'M' : 'F'; // operador ternário
		
		double imc = peso / (altura * altura);
		System.out.println("IMC: " + imc);
		
		// Sem operadores lógicos
		/*
		if (sexo == 'F') {
			if (imc < 19.1) {
				System.out.println("Abaixo do peso");
			} else if (imc < 25.9) {
				System.out.println("Peso ideal");
			} else if (imc < 27.4) {
				System.out.println("Pouco acima do peso");
			} else if (imc < 32.3) {
				System.out.println("Acima do peso");
			} else {
				System.out.println("Obesa");
			}
		} else {
			if (imc < 20.7) {
				System.out.println("Abaixo do peso");
			} else if (imc < 26.5) {
				System.out.println("Peso ideal");
			} else if (imc < 27.9) {
				System.out.println("Pouco acima do peso");
			} else if (imc < 31.1) {
				System.out.println("Acima do peso");
			} else {
				System.out.println("Obeso");
			}
		}
		*/
		
		// Com operadores lógicos
		// && (e/and) tem precedência sobre || (ou/or)
		if ((sexo == 'F' && imc < 19.1) || (sexo == 'M' && imc < 20.7)) { 
			// pode ser com parênteses
			System.out.println("Abaixo do peso");
		} else if (sexo == 'F' && imc < 25.9 || sexo == 'M' && imc < 26.5) { 
			// pode ser sem parênteses também por causa da precedência do && sobre o || 
			System.out.println("Peso ideal");
		} else if (sexo == 'F' && imc < 27.4 || sexo == 'M' && imc < 27.9) {
			System.out.println("Pouco acima do peso");
		} else if (sexo == 'F' && imc < 32.3 || sexo == 'M' && imc < 31.1) {
			System.out.println("Acima do peso");
		} else {
			System.out.println("Obeso(a)");
		}
		
	}
	
}

