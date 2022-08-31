import java.util.Scanner;
import java.util.Locale;

public class EstruturasDeControle {
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US);
		
		// System.out.println("Digite seu nome");
		// String nome = entrada.nextLine();
		
		// System.out.println("Oi " + nome);
		
		System.out.print("Nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Peso: ");
		int peso = entrada.nextInt();
		
		System.out.print("Altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.println("IMC de " + nome + ": " + imc);
		
		// Estruturas de controle if, if else, else
		if (imc < 18.5) {
			System.out.println("Abaixo do peso ideal");
		} else if (imc <= 25) {
			System.out.println("Peso ideal");
		} else if (imc <= 30) {
			System.out.println("Acima do peso ideal");
		} else if (imc <= 40) {
			System.out.println("Obesidade grau 1 ou 2");
		} else {
			System.out.println("Obesidade grau 3");
			System.out.println("Muito cuidado com o seu peso");
		}
		
		/* Código abaixo Também compila porém somente a próxima instrução ao
		 * if, if else ou else fará parte do bloco condicional.
		 * Não é uma boa prática.
		 */
		/*
		if (imc < 18.5)
			System.out.println("Abaixo do peso ideal");
		else if (imc <= 25)
			System.out.println("Peso ideal");
		else if (imc <= 30)
			System.out.println("Acima do peso ideal");
		else if (imc <= 40)
			System.out.println("Obesidade grau 1 ou 2");
		else
			System.out.println("Obesidade grau 3");
			System.out.println("Muito cuidado com o seu peso"); // esta linha sempre aparecerá
		*/
		
	}

}
