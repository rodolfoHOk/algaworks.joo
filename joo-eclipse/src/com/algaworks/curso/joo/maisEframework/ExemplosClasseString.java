package com.algaworks.curso.joo.maisEframework;

public class ExemplosClasseString {

	public static void main(String[] args) {
		// String é imutável		
		String nome = "Pedro";
		System.out.println(nome.toUpperCase());
		System.out.println(nome);
		nome = nome.toUpperCase();
		System.out.println(nome);
		
		// Comparação de Strings - equals()
		String s1 = "Pedro";
		String s2 = "Pedro";
		System.out.println("s1 == s2? " + (s1 == s2));
		
		String s3 = new String("Pedro");
		System.out.println("s3 == s1? " + (s3 == s1));
		
		System.out.println("s1.equals(s2)? " + (s1.equals(s2)));
		System.out.println("s3.equals(s1)? " + (s3.equals(s1)));
		
		String s4 = "PeDrO";
		System.out.println("s1.equals(s4)? " + (s1.equals(s4)));
		System.out.println("s1.equalsIgnoreCase(s4)? " + (s1.equalsIgnoreCase(s4)));
		
		// String é uma cadeia de caracteres - charAt()
		String s = "ALGAWORKS";
		
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(8));		
//		System.out.println(s.charAt(9)); // StringIndexOutOfBoundsException
		
		// Tamanho da String - length()
		String st = "Cursos online";
		
		System.out.println(st.length());
		System.out.println(st.charAt(12));
		
		// Criar String com char array - new String()
		char[] array = {'O', 'L', 'A'};
		
		String str = new String(array);
		System.out.println(str);
		
		// substring()
		String str2 = "Desenvolvimento Java";
		System.out.println(str2.substring(16));
		System.out.println(str2);
		
		String str3 = "Cursos online de desenvolvimento de software";
		System.out.println(str3.substring(7, 12)); // excluindo a partir do 12
		System.out.println(str3.substring(7, 13));
		
		// trim()
		String str4 = "   Algaworks      ";
		System.out.println(">" + str4 + "<");
		System.out.println(">" + str4.trim() + "<");
		
		// split()
		String str5 = "Cursos_online_de_desenvolvimento_de_software";
		String[] array2 = str5.split("_");
		for (int i = 0; i < array2.length; i++) {
			System.out.println("[" + i + "] " + array2[i]);
		}
		
		String x = "12;40.30;12;";
		String[] array3 = x.split(";");
		for (String str6 : array3) {
			System.out.println(str6);
		}
		
		// indexOf()
		String str7 = "Java";
		int indice = str7.indexOf('a');
		System.out.println(indice);
		
		indice = str7.lastIndexOf('a');
		System.out.println(indice);
		
		// replace() replaceAll()
		String str8 = "Desenvolvimento Java";
		System.out.println(str8.replace("Java", "de software"));
		System.out.println(str8.replaceAll("Java", "de software"));
	}
	
}
