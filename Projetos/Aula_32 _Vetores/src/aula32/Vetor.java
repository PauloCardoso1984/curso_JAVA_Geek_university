//	VETORES PARTE 1
// Arrays [vetores uni-dimensionais
/*	
 * int numeros [5].
 * 
 * para culcula o ultimo elemento é: 0.... [n - 1];
 * 
 * vetor [indice];
 * numero [0]; primeiro elemento
 * numero [1]; segundo elemento
 * numero [2]; terceiro elemento
 * numero [3]; quarto elemento
 * numero [4]; quinto
 * 
 * */

package aula32;

public class Vetor {
	public static void main(String[] args) {

		// Declarando o vetor
		int vetor[];

		// Declarando o tipo e instanciando e tamanho
		int numeros[] = new int[5];

		// Declarar e inicializar o vetor
		int outro_numeros[] = { 1, 3, 5, 7, 9 };

		// Outras formas
		// Declarar e especificando os tamanhos
		float valores[] = new float[5];
		char caractere[] = new char[20];
		String nomes[] = new String[4];

		// Exemplos
		String frutas[] = { "Manga", "Uva", "Banana" };

		System.out.println(frutas.length); // Mostra o tamanho do vetor

		for (String i : frutas) { // imprimirá os elementos
			System.out.println(i);
		}
		System.out.println();

// VETRORES PARTE 2
		// Informando o vetor, o tipo e o tamanho
		int numeros1[] = new int[10];

		// Inserindo de forma automatica
		for (int i = 0; i < numeros1.length; i++) {
			numeros1[i] = i + 1;
		}
		System.out.println("Primeiro vetor: " + numeros1[0]); // primeiro elemento
		System.out.println("ùltimmo vetor: " + numeros1[9]); // ultimo elemento
		System.out.println("Tamanho do vetor: " + numeros1.length);
		System.out.println();

		// USANDO A ESTRUTURA FOR EACH
		// para cada inteiro imprima o i
		for (int i : numeros1) {
			System.out.println(i);
		}
		System.out.println();

		// Biblioteca Match e Radom para numeros aleatórios
		for (int i = 0; i < numeros1.length; i++) {
			numeros1[i] = (int) Math.round(Math.random());
		}
		System.out.println(numeros1[1]);
		System.out.println();

		// Math rondom gera um número entre 0 e 1 x 100
		System.out.println(Math.random() * 100);
		System.out.println();

		// Math.round eMath.rondom gera um número entre 0 e 1 e arredenda
		System.out.println("Gerar números aleatórios de 0 a 100:");
		System.out.println(Math.round(Math.random() * 100));
		System.out.println(Math.round(Math.random() * 100));
		System.out.println(Math.round(Math.random() * 100));
		System.out.println(Math.round(Math.random() * 100));
		System.out.println(Math.round(Math.random() * 100));
		System.out.println(Math.round(Math.random() * 100));
		System.out.println(Math.round(Math.random() * 100));
		System.out.println(Math.round(Math.random() * 100));
		System.out.println(Math.round(Math.random() * 100));
		System.out.println(Math.round(Math.random() * 100));
		System.out.println(Math.round(Math.random() * 100));
		System.out.println(Math.round(Math.random() * 100));
		System.out.println(Math.round(Math.random() * 100));
		System.out.println(Math.round(Math.random() * 100));
		System.out.println(Math.round(Math.random() * 100));
		System.out.println(Math.round(Math.random() * 100));
		System.out.println(Math.round(Math.random() * 100));
		System.out.println(Math.round(Math.random() * 100));
		System.out.println(Math.round(Math.random() * 100));
		System.out.println(Math.round(Math.random() * 100));
		System.out.println();
	}
}
