package aula_19;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Leia uma data e determine se ela é válida, ou seja, verifique se o mês está entre 1 e 12, e se o dia existe naquele mês. Note que Fevereiro tem 29 dias em anos bissextos, e 28 dias nos demais.");
		System.out.println();

        System.out.println("Digite uma data no formato dd/mm/aaaa: ");
        String dataString = sc.nextLine();
        sc.close();
        
        // Verificar se a data possui 10 caracteres
        if (dataString.length() != 10) {
            System.out.println("Data inválida!");
            return;
        }
        
        // Extrair dia, mês e ano da string
        int dia = Integer.parseInt(dataString.substring(0, 2));
        int mes = Integer.parseInt(dataString.substring(3, 5));
        int ano = Integer.parseInt(dataString.substring(6, 10));
        
        // Verificar se o ano é bissexto
        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
        
        // Verificar se o mês está entre 1 e 12
        if (mes < 1 || mes > 12) {
            System.out.println("Data inválida!");
            return;
        }
        
        // Verificar se o dia está dentro do intervalo correto para cada mês
        int maxDia;
        switch (mes) {
            case 2:
                maxDia = bissexto ? 29 : 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDia = 30;
                break;
            default:
                maxDia = 31;
                break;
        }
        
        if (dia < 1 || dia > maxDia) {
            System.out.println("Data inválida!");
            return;
        }
        
        System.out.println("Data válida!");
        sc.close();
    }
}

