package aula_102;

/* Armazenamento Sequencial
 * 
 * 
 * int numeros[] = new int[5];
 * 
 * numeros[0] = 1;
 * numeros[1] = 3;
 * numeros[2] = 5;
 * numeros[3] = 7;
 * numeros[4] = 9;
 * */

public class Programa {
	public static void main(String[] args) {
		
		int numeros[] = new int[5];
		
		System.out.println("Lista vazia: ");
		for (int i=0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		System.out.println("===============================");
		System.out.println();
		
		Vetor lista = new Vetor();
		
		System.out.println("Quantidade de elementos na lista: " + lista.tamanho());
		
		Aluno a1 = new Aluno("Paulo Cardoso");
		Aluno a2 = new Aluno("Reginaldo Cardoso");
		
		lista.adiciona(a1);		
		System.out.println("Quantidade de elementos na lista: " + lista.tamanho());
		
		lista.adiciona(a2);		
		System.out.println("Quantidade de elementos na lista: " + lista.tamanho());
		
		System.out.println("Elementos da lista: " + lista);
		
		System.out.println();
		
		System.out.println("Contem aluno 1 = " + lista.contem(a1));
		
		System.out.println();
		
		System.out.println("Pegar o aluno na posição 1 ->  " + lista.pega(0));
		System.out.println("Pegar o aluno na posição 1 ->  " + lista.pega(1));
		
		System.out.println();
		
		try {
			System.out.println("Pegar o aluno na posição 1 ->  " + lista.pega(101));
		} catch (IllegalArgumentException e) {
			System.out.println("O aluno na posição 101 não existe.");
		}
		
		System.out.println();
		
		Aluno a3 = new Aluno("Cardoso Paulo");
		lista.adiciona(0, a3);
		
		System.out.println("Elementos da lista (2): " + lista);
			
	}
}