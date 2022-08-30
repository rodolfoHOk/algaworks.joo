public class CalculadoraProfessor {

	public static void main(String[] args) {
		
		// constante do Pi - http://pt.wikipedia.org/wiki/Pi
		float pi = 3.14f;
		
		// raio - informado pelo professor
		float raio = 5.3f;
		
		// escolha exibir ou não a fórmula
		boolean exibirFormula = true;
		
		// area é igual ao raio ao quadrado multiplicado por Pi
		float area = raio * raio * pi;
		int areaSemCasasDecimais = (int) area;
		
		if (exibirFormula) {
			System.out.println("Fórmula do calculo da área de um círculo: area = raio * raio * 3.14");
		}
		
		System.out.println("Resultado: " + area);
		System.out.println("Resultado sem casas decimais: " + areaSemCasasDecimais);
		
	}

}
