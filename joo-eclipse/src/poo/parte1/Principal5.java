package poo.parte1;

public class Principal5 {
	
	public static void main(String[] args) {
		
		Paciente paciente = new Paciente();
		paciente.altura = 1.70;
		paciente.peso = 75;
		
//		double imc = paciente.calcularIndiceDeMassaCorporal();
		IMC imc = paciente.calcularIndiceDeMassaCorporal();
		
		System.out.println("IMC do paciente: " + imc.indice);
		System.out.println("Abaixo do peso ideal: " + imc.abaixoDoPesoIdeal);
		System.out.println("Peso ideal: " + imc.pesoIdeal);
		System.out.println("Obeso: " + imc.obeso);
		System.out.println("Grau de obesidade: " + imc.grauDeObesidade);
		
	}
	
}
