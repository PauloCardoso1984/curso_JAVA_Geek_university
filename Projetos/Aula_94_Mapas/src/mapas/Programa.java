package mapas;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/* Mapas -> Map
 - Os mapas são representados pela interface Map e mapeia seus
 elementos utilizando o conceito de chave/valor.
 
 - Mapas são conhecido como representassem 3 coleções:
 - coleção de chaves;
 - coleção de valores;
 - coleção de associações.
 
 */
public class Programa {
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

		Map<Integer, String> pessoas = new HashMap<Integer, String>();

		pessoas.put(25, "Paulo Cardoso");
		pessoas.put(31, "Cardoso Paulo");
		pessoas.put(15, "Cardoso Reginaldo");

		// O método keySet, pegará a idade
		// Coleção de chaves
		System.out.println("Coleção de chaves: ");
		System.out.println(pessoas.keySet());
		System.out.println();

		// Coleção de valores
		System.out.println("Coleção de valores: ");
		System.out.println(pessoas.values());
		System.out.println();

		// Coleção de associações
		System.out.println("Coleção de associações: ");
		System.out.println(pessoas.entrySet());
		System.out.println(pessoas);
		System.out.println();

		// Iterar na coleção de chaves (nome)
		System.out.println("Imprimirá as pessoas:");
		pessoas.keySet().forEach(nome -> {
			System.out.println(pessoas.get(nome));
		});
		System.out.println();

		// Iterar na coleção de chaves (idade)
		System.out.println("Iterar na coleção de chaves: ");
		Set<Integer> chaves = pessoas.keySet();
		for (Integer idade : chaves) {
			System.out.println(idade);
		}
		System.out.println();
		
		// Iterar na coleção de valores 
		// Forma 1
		Collection<String> valores = pessoas.values();
		for (String nome : valores) {
			System.out.println(nome);
		}
		System.out.println();
		
		// Forma 2
		pessoas.values().forEach(nome -> {
			System.out.println(nome);
		});	
		System.out.println();
		
		
		// Iterar a coleção de associações
		// Forma 1
		Set<Entry<Integer, String>> associacoes = pessoas.entrySet();
		for (Entry<Integer, String> associacao : associacoes) {
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		}
		System.out.println();
		
		// Forma 2
		pessoas.entrySet().forEach(associacao -> {
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		});
			
		tc.close();
	}
}