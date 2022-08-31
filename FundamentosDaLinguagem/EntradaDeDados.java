import java.util.Scanner;
import java.util.Locale;

public class EntradaDeDados {
	
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
		
	}

}
