package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Escreva um programa completo que permita a qualquer aluno introduzir, pelo teclado, \n"
				+ "uma sequência arbitrária de notas (Válidas no intervalo de 0 a 10) e que mostre na tela, como \n"
				+ "resultado, a correspondete média aritmética. O número de notas com o aluno pretenda afeturar \n"
				+ "o calculo não será fornecido ao programa, o qual encerrará quando for introduzido um valor que \n"
				+ "não seja válido como nota.");
		
		System.out.println();		
		
		System.out.println("Faça um programa que leia apenas número positivo e imprima seus divisores.");
		System.out.println();

		// LER NÚMERO POSITIVO DO USUÁRIO
		System.out.print("Digite um número positivo: ");
		int numero = sc.nextInt();

		// VERIFICAR SE O NÚMERO É POSITIVO
		if (numero <= 0) {
			System.out.println("O número digitado não é positivo.");
		} 
		else {
			System.out.println("Divisores do número " + numero + ":");
			
			// ENCONTRAR E IMPRIMIR OS DIVISORES
			for (int i = 1; i <= numero; i++) {
				if (numero % i == 0) {
					System.out.print(i + " ");
				}
			}
		}
	}
}