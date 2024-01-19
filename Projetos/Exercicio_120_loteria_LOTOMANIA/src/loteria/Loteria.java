package loteria;

import java.util.Random;

public class Loteria {

	public static void main(String[] args) {
		// Criação do objeto Random para gerar números aleatórios
		Random rand = new Random();

		// Gerando 50 números aleatórios entre 0 e 100 - LOTOMANIA
		System.out.print("LOTOMANIA : ");
		for (int i = 0; i < 50; i++) {
			int numero = rand.nextInt(101); // Gera número entre 0 e 60
			System.out.print(numero + " - ");
		}System.out.println();
		
		System.out.println();
		
		System.out.print("MEGA-SENA : ");
		
		// Gerando 50 números aleatórios entre 0 e 60 - MEGA SENA
		for (int i = 0; i < 7; i++) {
			int numero = rand.nextInt(61); // Gera número entre 0 e 100
			System.out.print(numero + " - ");
		}
	}
}