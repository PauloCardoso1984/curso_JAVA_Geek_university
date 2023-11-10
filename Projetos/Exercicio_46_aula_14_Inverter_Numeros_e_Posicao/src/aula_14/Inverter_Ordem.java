package aula_14;

import java.util.Scanner;

public class Inverter_Ordem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Faça um programa que leia um número inteiro positico de 3 digitos (100 a 999). \n"
				+ "Gere um outro numero de forma inversa. Solicite uma palavra e também inverta.");
		System.out.println();

		System.out.print("Digite um número para ser invertido: ");
		int numero = sc.nextInt();
		if (numero < 100 || numero > 999) {
			System.out.println("Numero fora de padrão!");
		}
		Integer a = numero;
		String b = a.toString();
		String c = "";

		for (int i = b.length(); i > 0; i--) {
			c += b.substring(i - 1, i);
		}
		System.out.println("Número invertido: " + c);
		System.out.println();
		

		System.out.print("Digite uma palavra: ");
	    String str = sc.next();
	    
	    String reverseStr = reverseIt(str, str.length() - 1);
	    System.out.println("Palavra invertida: " + reverseStr);
	  }
	
	// METODO PARA INVERSÃO
	  static String reverseIt(String str, int index) {
	    if (index == 0) {
	      return str.charAt(0) + "";
	    }
	    char letter = str.charAt(index);
	    return letter + reverseIt(str, index - 1);

  }
}