package poo.parte2;

public class ArCondicionado {

//	int temperatura;
	private int temperatura;
	
	public void trocarTemperatura(int temperatura) {
		if (temperatura >= 15 && temperatura <= 25) {
			this.temperatura = temperatura;
		} else {
			System.err.println("Temperatura inválida");
		}
	}
	
	public int obterTemperatura() {
		return this.temperatura;
	}
	
}
