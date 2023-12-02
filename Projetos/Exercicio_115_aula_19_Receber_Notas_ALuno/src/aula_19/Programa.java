package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Escreva um programa completo que permita a qualquer aluno introduzir, pelo teclado, \n"
				+ "uma sequência arbitrária de notas (Válidas no intervalo de 0 a 10) e que mostre na tela, como \n"
				+ "resultado, a correspondete média aritmética. O número de notas com o aluno pretenda afeturar o \n"
				+ "calculo não será fornecido ao programa, o qual encerrará quando for introduzido um valor que \n"
				+ "não seja válido como nota, dentro do intervalo.");
		System.out.println();		
		
		 int contador = 0; 
		 double soma = 0;
		
        // RECEBE AS NOTAS
        System.out.println("---DIGITE AS NOTAS---");
        System.out.print("Dentro do intervalo de 0 a 10: ");

        while (true) {
            double nota = sc.nextDouble();
            if (nota < 0 || nota > 10) {
            	System.out.println();
            	System.out.println("Nota fora do intervalo...");
            	System.out.println("PROGRAMA ENCERRADO...");
                break;
            }
            contador++;
            soma += nota;
            System.out.print("Dentro do intervalo de 0 a 10: ");
        }
        if (contador == 0) {
            System.out.println("Nenhuma nota válida foi inserida.");
        } else {
            double media = soma / contador;
            System.out.println();
            System.out.println("A média aritmética é: " + media);
        }
        sc.close();
    }
}