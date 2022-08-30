public class PromocaoAritmetica {

	public static void main(String[] args) {
	
		int x = 10;
		int y = 5;
		int z = x + y;
		System.out.println(z);
		
		int x2 = 10;
		long y2 = 5;
		// int z2 = x2 + y2; // erro de compilação: possível perdas
		long z2 = x2 + y2; // obs: para efetuar o cálculo o Java promove o x2 ao tipo long
		System.out.println(z2);
		
		long x3 = 10;
		float y3 = 9.34f;
		// long z3 = x3 * y3; // erro de compilação: possível perdas
		float z3 = x3 * y3; // obs: para efetuar o cálculo o Java promove o x2 ao tipo long para realizar a operação
		System.out.println(z3);
		
		int x4 = 3;
		int y4 = 2;
		float z4 = x4 / y4; // resultado será 1.0 pois lado direito da operação são tipo int
		System.out.println(z4);
		
		int x5 = 3;
		float y5 = 2;
		float z5 = x5 / y5; // aqui o resultado será 1.5 o x5 é promovido para float para que a operação seja realizada
		System.out.println(z5);
		
		int x6 = 3;
		int y6 = 2;
		float z6 = x6 / (float) y6; // aqui o resultado será 1.5 idem ao caso acima
		System.out.println(z6);

	}

}
