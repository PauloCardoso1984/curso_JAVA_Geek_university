package aula_14;

import java.util.Scanner;

public class UmNumeroPorLinha {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Faça um programa que leia um número inteiro positivo de 1000 a \n"
				+ "9999 em imprima um em cada linha até o número e do número até 0.");
		System.out.println();

		System.out.print("Digite um número de 4 algarismo: ");
        int numero = sc.nextInt();
        
        // Verifica se o número está dentro do intervalo especificado
        if (numero >= 1000 && numero <= 9999) {
            // Separa cada dígito do número e imprime em uma linha separada
            int digito1 = numero / 1000;
            int digito2 = (numero % 1000) / 100;
            int digito3 = (numero % 100) / 10;
            int digito4 = numero % 10;
            
            System.out.println(digito1);
            System.out.println(digito2);
            System.out.println(digito3);
            System.out.println(digito4);
        } 
        if (numero <= 1000 || numero >= 9999) {
            System.out.println("Número inválido! O número deve estar entre 1000 e 9999.");     
        }
		sc.close();
    }
}