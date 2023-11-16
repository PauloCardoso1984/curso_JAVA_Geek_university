package aula16;

import java.util.Scanner;

public class OperadorTernario {
	public static void main(String[] args) {
		
	// DECLARANDO E INICIALIZANDO A VARIÁVEL
	int valor = 3, numero;
/*	
	// MANEIRA TRADICIONAL
	if (valor > 0 ) {
		numero = valor;
		}
	else {
		numero = 7;
		}
*/	
	// OPERADOR TERNÁRIO
	numero = (valor > 0) ? valor : 7;
	
	System.out.println(numero);
	}
}