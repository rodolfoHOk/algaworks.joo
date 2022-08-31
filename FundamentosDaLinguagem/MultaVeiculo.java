/*
- Se o veículo for um carro de passeio e a velocidade do veículo for 10% maior que a velocidade permitida na via, o veículo deve ser multado.
- Se o veículo for um caminhão e a velocidade do veículo for 5% maior que a velocidade permitida na via, o veículo deve ser multado.
*/

import java.util.Scanner;
import java.util.Locale;

public class MultaVeiculo {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US);
		
		System.out.print("Tipo de veículo (passeio, caminhao): ");
		String tipoVeiculo = entrada.next();
		
		System.out.print("Velocidade máxima permitida na via: ");
		int velocidadeMaxima = entrada.nextInt();
		
		System.out.print("Velocidade do veículo: ");
		int velocidadeVeiculo = entrada.nextInt();
		
		/*
		if (tipoVeiculo.equals("passeio") && velocidadeVeiculo > 1.1 * velocidadeMaxima) {
			System.out.println("Veículo Multado");
		} else if (tipoVeiculo.equals("caminhao") && velocidadeVeiculo > 1.05 * velocidadeMaxima) {
			System.out.println("Veículo Multado");
		}
		*/
		
		if ((tipoVeiculo.equals("passeio") && velocidadeVeiculo > 1.1 * velocidadeMaxima) ||
		    (tipoVeiculo.equals("caminhao") && velocidadeVeiculo > 1.05 * velocidadeMaxima)) {
			System.out.println("Veículo Multado");
		}
		
	}

}

