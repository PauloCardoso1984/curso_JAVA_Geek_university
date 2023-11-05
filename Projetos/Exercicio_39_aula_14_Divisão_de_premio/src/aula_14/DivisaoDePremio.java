package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class DivisaoDePremio {

	public static void main(String[] args) {


		System.out.println("Faça um programa para calcular a importância de R$ 780.000,00 será dividida \n"
				+ "em três ganhadores de um concurso. Sendo a quantia de. 1º lugar 46%, 2º lugar 32%, \n"
				+ "e o restante para o 3º lugar");
		
		System.out.println();
		
		// SUBSTITUIRÁ A VIRGULA POR PONTO
		Locale.setDefault(Locale.US);
		// INSTANCIANDO A COMUNICAÇÃO EXTERNA POR MEIO DO TECLADO
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor do prêmio é de R$ 780.000,00");
		System.out.println();
		
		// CALCULANDO A PRÊMIAÇÃO
		double total = 780000.00;
		
		double premio1 = total / 100 * 46;
		double premio2 = total / 100 * 32;
		double premio3 = total - (premio1 + premio2);
		
		// A COLOCAÇÃO DO %.2f%n SERVIRÁ PARA COLOCAR 02 CASAS APÓS A VIRGULA
		System.out.printf(" 1º prêmio receberá R$ %.2f%n ", premio1);
		System.out.printf("2º prêmio receberá R$ %.2f%n ", premio2);
		System.out.printf("3º prêmio receberá R$ %.2f%n ", premio3);


	}

}
