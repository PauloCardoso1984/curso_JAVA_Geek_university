package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Par_Impar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Leia um número fornecido pelo usuário. Verificar se é Par ou Impar.");
		System.out.println();

		System.out.print("Digite o número: ");
		int numero1 = sc.nextInt();

		// VERIFICAÇÃO
		if (numero1 % 2 == 0) {
			System.out.println("O número " + numero1 + " é PAR.");
		} else {
			System.out.println("O número " + numero1 + " é IMPAR.");
		}
		sc.close();
	}
}