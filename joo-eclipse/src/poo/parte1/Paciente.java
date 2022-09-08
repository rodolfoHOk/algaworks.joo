package poo.parte1;

public class Paciente {

	double peso;
	double altura;
	
//	double calcularIndiceDeMassaCorporal() {
//		double imc = peso / (altura * altura);
//		
//		return imc;
//	}
	
	IMC calcularIndiceDeMassaCorporal() {
		IMC imc = new IMC();
		double indice = peso / (altura * altura);
		imc.indice = indice;
		
		if (indice < 18.5) {
			imc.abaixoDoPesoIdeal = true;
		} else if (indice < 25) {
			imc.pesoIdeal = true;
		} else {
			imc.obeso = true;
			
			if (indice < 30) {
				imc.grauDeObesidade = "Acima do peso";
			} else if (indice < 35) {
				imc.grauDeObesidade = "Obeso de grau I";
			} else if (indice < 40) {
				imc.grauDeObesidade = "Obeso de grau II";
			} else {
				imc.grauDeObesidade = "Obeso de grau III";
			}
		}
		
		return imc;
	}
	
}
