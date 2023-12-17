package tryCath;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		// DIVISÃO POR 0 DARÁ ERRO
		Scanner tc = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número para divisão: ");
		int n1 = tc.nextInt();
		
		System.out.print("Informe o segundo número para divisão: ");
		int n2 = tc.nextInt();
		
		try {
			System.out.print("A divisão do 1º numero " + n1 + " pelo 2º numero " + n2 + " é : " + n1 / n2);
		} catch (ArithmeticException e) {
			System.out.println("A divisão do " + n1 + " por "+ n2 + ". Impossivel divisão por 0.");
		}

		tc.close();
	}
}
