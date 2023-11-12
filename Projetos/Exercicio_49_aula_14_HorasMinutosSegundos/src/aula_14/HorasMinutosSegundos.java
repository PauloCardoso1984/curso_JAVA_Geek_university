package aula_14;

import java.util.Scanner;

public class HorasMinutosSegundos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Faça um programa que leia um horario (hora, minutos e segundos) de inicio e a \n"
				+ "duraçao em segundos, de uma experiencia biologica. O programa deve resultar como o novo \n "
				+ "horário (horas, minutos e segundos) do termino da mesma.");
		System.out.println();

        // Leitura do horário de início
        System.out.println("Informe o horário de início da experiência:");
        System.out.print("Hora: ");
        int horaInicio = sc.nextInt();
        System.out.print("Minuto: ");
        int minutoInicio = sc.nextInt();
        System.out.print("Segundo: ");
        int segundoInicio = sc.nextInt();

        // Validação do horário de início
        if (horaInicio < 0 || horaInicio >= 24 || minutoInicio < 0 || minutoInicio >= 60 || segundoInicio < 0 || segundoInicio >= 60) {
            System.out.println("Horário de início inválido.");
            sc.close();
            return;
        }

        // Leitura da duração em segundos
        System.out.print("Informe a duração da experiência em segundos: ");
        int duracao = sc.nextInt();

        // Cálculo do novo horário do término
        int somaSegundos = segundoInicio + duracao;
        int novoSegundo = somaSegundos % 60;

        int somaMinutos = minutoInicio + (somaSegundos / 60);
        int novoMinuto = somaMinutos % 60;

        int somaHoras = horaInicio + (somaMinutos / 60);
        int novoHora = somaHoras % 24;

        // Exibição do novo horário do término
        System.out.println("\nNovo horário do término da experiência:");
        System.out.println("Hora: " + novoHora);
        System.out.println("Minuto: " + novoMinuto);
        System.out.println("Segundo: " + novoSegundo);

        sc.close();
    }
}
