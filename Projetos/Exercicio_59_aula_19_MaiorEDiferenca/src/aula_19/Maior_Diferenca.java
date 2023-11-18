package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Maior_Diferenca {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Leia um número fornecido pelo usuário. Verificar qual é o maior e mostrar a diferença entre eles.");
		System.out.println();

		System.out.print("Digite o 1º número: ");
		int numero1 = sc.nextInt();
		
		System.out.print("Digite o 2º número: ");
		int numero2 = sc.nextInt();
		
		// VERIFICAÇÃO
		if (numero1 < numero2) {
			System.out.println("Maior número é " + numero2);
		} 
		if (numero1 > numero2) {
			System.out.println("Maior número é " + numero1);
		}
		
		// CALCULANDO A DIFERENÇA
		if (numero1 < numero2) {
			int n1 = numero2 - numero1;
			System.out.println("A diferença entre eles é de " + n1);
		} 
		if (numero2 < numero1) {
			int n1 = numero1 - numero2;	
			System.out.println("A diferença entre eles é de " + n1);
		}
		sc.close();
	}
}