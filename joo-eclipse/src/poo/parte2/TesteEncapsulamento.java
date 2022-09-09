package poo.parte2;

public class TesteEncapsulamento {

	public static void main(String[] args) {
	
		ArCondicionado ar = new ArCondicionado();
		
//		ar.temperatura = 20;
		ar.trocarTemperatura(21);
//		System.out.println("Temperatura do ar: " + ar.temperatura + "°C"); // não é mais permitido
		System.out.println("Temperatura do ar: " + ar.obterTemperatura() + "°C");
		
//		ar.temperatura = 10; // não é mais permitido
		ar.trocarTemperatura(10);
		System.out.println("Temperatura do ar: " + ar.obterTemperatura() + "°C");
		
	}
	
}
