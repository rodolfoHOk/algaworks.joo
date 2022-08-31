import java.util.Scanner;

public class EscopoDeVariaveis {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Idade: ");
		int idade = entrada.nextInt();
		
		boolean podeDirigir = idade >= 18;
		
		// para resolver o ploblema da variável nomePai dentro do if
		String nomePai = ""; // declaramos a variável fora do bloco
		
		if (!podeDirigir) {
			System.out.print("Nome do pai: ");
			// String nomePai = entrada.next(); // não compila pois esta variável só existe dentro deste bloco de if
			nomePai = entrada.next(); // atribuímos o valor a varíável existente
		}
		
		System.out.println("Você pode dirigir?");
		
		if (podeDirigir) {
			System.out.println("Sim, desde que tenha uma CNH");
		} else {
			System.out.println("Não, se fizer isso, seu pai " + nomePai + " vai preso!");
		}
		
	}

}

