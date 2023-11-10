package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class FuncoesString {

	public static void main(String[] args) {

		System.out.println("Faça um programa para converter diversas Strings \n");
		System.out.println("-> tornar minusculo em MAIUSCULO e vice-versa; \n"
				+ "-> recortar uma String \n"
				+ "-> substituir uma String \n"
				+ "-> Buscar uma String");
		System.out.println();
		
		// MIMUSCULA = toLowerCase()
		// MAIUSCULA = toUpperCase()
		// ELIMINA ESPAÇO NOS CANTOS = trim()
		// RECORTAR String = subdtring
		// TROCAR STRING = replace
		// ENCONTRAR A 1ª POSIÇÃO DE DETERMINADA String = indexOf()
		// ENCONTRAR A ULTIMA OCORRENCIA DE UMA DETERMINADA STRING = lastIndexOf
		
		Scanner sc = new Scanner(System.in);
		
		String minuscula = "paulo reginaldo cardoso";
		String maiuscula = "PAULO REGINALDO CARDOSO";
		String mista = "       Paulo Reginaldo Cardoso      ";
		
		String transformamaiuscula = minuscula.toUpperCase();
		String transformaminuscula = maiuscula.toLowerCase();
		String eliminaespaco = mista.trim();
		String cortarstring = minuscula.substring(3);
		String cortarposicao = maiuscula.substring(2, 10);
		String trocarstring = minuscula.replace('a', 'b');
		String trocarstring1 = minuscula.replace("paulo", "Paulo");
		int primeiraposicao = mista.indexOf("Cardoso");
		int ultimaposicao = mista.lastIndexOf("so");
		
		System.out.println("Transformar em maisculas: 	" + transformamaiuscula);
		System.out.println("Transformar em minuscula:	 " + transformaminuscula);
		System.out.println("Elimina espaços nos cantos: 	" + eliminaespaco + " -");
		System.out.println("Recortar uma String: 		" + cortarstring);
		System.out.println("Recortar uma String por posicão: " + cortarposicao);
		System.out.println("Trocar uma String por outa:	 " + trocarstring);
		System.out.println("Trocar uma String por outa:	 " + trocarstring1);
		System.out.println("Procurar pela 1ª ocorrencia:	 " + primeiraposicao);
		System.out.println("Procurar pela última ocorrencia: " + ultimaposicao);

		sc.close();
	}
}
