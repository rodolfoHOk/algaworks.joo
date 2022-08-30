public class OperadorAritmetico1 {

	public static void main(String[] args) {
	
		int soma = 2 + 10;
		int subtracao = 6 - 10;
		int multiplicacao = 8 * 3;
		int divisao = 8 / 2;
		int resto = 7 % 2;
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(multiplicacao);
		System.out.println(divisao);
		System.out.println(resto);
		
		int notaAluno1 = 99;
		int notaAluno2 = 80;
		int notaAluno3 = 53;
		
		int totalGeral = notaAluno1 + notaAluno2 + notaAluno3;
		System.out.println(totalGeral);
		
		int mediaGeral = notaAluno1 + notaAluno2 + notaAluno3 / 3; // errado divisão tem preferência
		System.out.println(mediaGeral); 
		// obs: multiplicação também tem preferência sobre soma e subtração assim como a divisão
		
		int mediaGeral2 = (notaAluno1 + notaAluno2 + notaAluno3) / 3;
		System.out.println(mediaGeral2);
		
		int mediaGeral3 = totalGeral / 3;
		System.out.println(mediaGeral3);
	
	}
	
}
