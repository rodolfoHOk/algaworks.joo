package wrappers_boxing_arrays;

public class TesteClassesWrapper {
	
	
	public static void main(String[] args) {
				
		// Primitivos : byte, short, int, long, float, double e char
		// Wrapper    : Byte, Short, Integer, Long, Float, Double e Character
		
		int x = 5;
		Integer i = Integer.valueOf(x);
		
		byte y = i.byteValue(); // xyzValue();
		System.out.println(y);
		
		String valorTotal = "15.5";
		Float v = Float.valueOf(valorTotal);
		System.out.println(v + 3);
		
		int idade = Integer.parseInt("27"); // parseXYZ();
		System.out.println("Idade daqui a 5 anos: " + (idade + 5));
		
		try {
			// double custo = Double.parseDouble("23.5");
			double custo = Double.parseDouble("vinte e três reais e cinquenta centavos");
			System.out.println(custo);
		} catch (NumberFormatException e) {
			System.err.println("Número inválido para conversão");
		}
		
	}
		
}
