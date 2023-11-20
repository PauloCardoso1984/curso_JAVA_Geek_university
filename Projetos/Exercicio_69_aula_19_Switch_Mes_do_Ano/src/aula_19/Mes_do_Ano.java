package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Mes_do_Ano {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Usando switch, escreva um programa que leia um inteiro entre 1 e 12 e imprima o mes do \n"
				+ "ano correspondente a este número. Isto é, Janeiro se 1, Fevereiro se 2, e assim por diante.");
		System.out.println();

		String dia;
		
		System.out.print("Digite um número (ente 1 a 12) e veja qual é o mes do ano: ");
		int numero = sc.nextInt();
	
		switch (numero) {
		case 1:
			dia = "Janeiro";
			break;
		case 2:
			dia = "Fevereiro";
			break;
		case 3:
			dia = "Março";
			break;
		case 4:
			dia = "Abril";
			break;
		case 5:
			dia = "Maio";
			break;
		case 6:
			dia = "Junho";
			break;
		case 7:
			dia = "Julho";
			break;
		case 8:
			dia = "Agosto";
			break;
		case 9:
			dia = "Setembro";
			break;
		case 10:
			dia = "Outubro";
			break;
		case 11:
			dia = "Novembro";
			break;
		case 12:
			dia = "Dezembro";
			break;
		default:
			dia = "Número inválido";
			break;
		}		
	
		System.out.println("Mes do ano e´ : " + dia);		
		
		sc.close();
	}
}
