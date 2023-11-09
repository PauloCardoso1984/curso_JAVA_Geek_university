package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class FolhaSalario {

	public static void main(String[] args) {

		System.out.println("Escreva um programa de ajuda para vendedores. A partir de um valor lido, mostre: \n"
				+ "* o total a pagar a vista com 10% de desconto;"
				+ "* o valor de cada parcela, no parcelamento 3x sem juros;"
				+ "* a comissão do vendedor, no caso de venda ser a vista (5% sobre o valor com desconto)"
				+ "* a comissão do vendedor, no caso da venda ser parcelada (5% sobre o valor total");
		
		System.out.println();
		
		// SUBSTITUIRÁ A VIRGULA POR PONTO
		Locale.setDefault(Locale.US);
		// INSTANCIANDO A COMUNICAÇÃO EXTERNA POR MEIO DO TECLADO
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual o valor da venda R$ ");
		double venda = sc.nextDouble();
		System.out.println();
		
		System.out.print("Pagamento será à vista (V) ou à prazo (P) sendo 3x sem juros? ");
		char x = sc.next().charAt(0);
		if (x == 'V') {
			double valorvista = venda - (venda * 0.10);
			double valorrecebervista = valorvista * 0.05;
			System.out.printf(" O valor a ser pago à vista será de R$ %.2f%n ", valorvista);
			System.out.printf("O valor a receber em comissão é de R$ %.2f%n ", valorrecebervista);
		}
		else if (x == 'P') {
				double valorparcela = venda / 3;
				double valorreceberprazo = venda * 0.10;
				System.out.printf(" O valor da prestação será de (3 vezes) de R$ %.2f%n ", valorparcela);
				System.out.printf("O valor a receber em comissão é de R$ %.2f%n ", valorreceberprazo);
			}

		sc.close();
	}
}
