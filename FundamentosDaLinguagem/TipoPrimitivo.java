public class TipoPrimitivo {

	public static void main(String[] args) {
	
		double precoProduto = 9.43; // double tamanho 64bits 
		
		boolean alunoMatriculado = true; // boolean tamanho 1bit valores false ou true
		boolean clienteBloqueado = false;
		
		// boolean alunoMatriculado2 = 1; // não funciona em Java
		// boolean clienteBloqueado2 = 0; // não funciona em Java
		
		char turmaAluno1 = 'A'; // char tamanho 16bits valores de 0 a 2 elevado a 16 menos 1
		char tipoCliente = '2';
		char simbolo = '@';
		// obs: char tem que estar em aspas simples
		
		// Números Inteiros
		byte inteiro8bits; // valores de -2 elevado a 7 até 2 elevado a 7 menos 1
		short inteiro16bits; // valores de -2 elevado a 15 até 2 elevado a 15 menos 1
		int inteiro32bits; // valores de -2 elevado a 31 até 2 elevado a 31 menos 1
		long inteiro64bits; // valores de -2 elevado a 63 até 2 elevado a 63 menos 1
		
		// Números Decimais
		float real32bits;
		double real64bits;
		
		long populacaoUberlandia = 650000;
		System.out.println(populacaoUberlandia);
		
		// long populacaoMundial = 7000000000; // erro de compilação pois no Java padrão de número literal é int
		long populacaoMundial = 7000000000L; // então colocamos um L ou l no final
		long populacaoMundial2 = 7000000000l;
		System.out.println(populacaoMundial);
		
		// float saldoConta = 1030.43; // erro de compilação pois no Java padrão de número decimal é double
		float saldoConta = 1030.43F; // então colocamos um F ou f no final
		float saldoConta2 = 1030.43f;
		System.out.println(saldoConta);
		
	}

}
