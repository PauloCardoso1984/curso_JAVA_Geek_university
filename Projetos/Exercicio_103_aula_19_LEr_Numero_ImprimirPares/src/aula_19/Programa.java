package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

        int soma = 0;

        for (int i = 2; i <= 100; i += 2) {
            soma += i;
            System.out.println(i);
        }

        System.out.println("A soma dos 50 primeiros números pares é: " + soma);
    }
}