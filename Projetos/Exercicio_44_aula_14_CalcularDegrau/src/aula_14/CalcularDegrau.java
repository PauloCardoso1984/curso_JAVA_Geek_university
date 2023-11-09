package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class CalcularDegrau {

	public static void main(String[] args) {

		System.out.println("Receba a altura do degrau de uma escada e a altura que o usuário deseja alcançar \n"
				+ "subindo a escada. Calcule e mostre quantos degraus o usuário deverá subir para atingir seu \n"
				+ "objetivo.");
		
		System.out.println();
		
		// SUBSTITUIRÁ A VIRGULA POR PONTO
		Locale.setDefault(Locale.US);
		// INSTANCIANDO A COMUNICAÇÃO EXTERNA POR MEIO DO TECLADO
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual a altura da escada (m) ");
		double escada = sc.nextDouble();
		System.out.println();
		
		System.out.print("Qual altura de cada degrau (cm) ");
		double degrau = sc.nextDouble();
		
		// CALCULO DA ESCADA
		double transformacao = escada * 100;
		
		double quantidadedegrau = transformacao / degrau;
		
		System.out.println("A quantidade de degraus a ser realizado será de " + quantidadedegrau);
		
		sc.close();
	}
}
