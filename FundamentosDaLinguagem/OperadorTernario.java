import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		// com operador ternário
		String indicacao = (idade >= 18) ? "adulto" : "criança / adolescente";
		
		// funciona mas não é uma boa prática
		// String indicacao = (idade >= 18) ? "adulto" : (idade < 12) ? "criança" : "adolescente";
		
		// outro exemplo
		// int x = (idade >= 18) ? 1 : 2;
		
		// sem operador ternário
		/*
		String indicacao = "";
		
		if (idade >= 18) {
			indicacao = "adulto";
		} else {
			indicacao = "criança / adolescente";
		}
		*/
	
		System.out.println("Resultado: " + indicacao);
	}

}
