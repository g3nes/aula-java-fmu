package EstruturasCondicionais.ListaExercicios;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		/*
		 * 14. Usando switch, escreva um programa que leia um inteiro entre 1 e 12 e
		 * mostre o m�s correspondente a este n�mero, isto �, janeiro se 1, fevereiro se
		 * 2, e assim por diante.
		 */ 
		int mes;
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Informe o m�s (1-12): ");
		mes = sc.nextInt();
		
		sc.close();

		switch (mes) {
			case 1:
				System.out.println("Janeiro");
				break;
			case 2:
				System.out.println("Fevereiro");
				break;
			case 3:
				System.out.println("Mar�o");
				break;
			case 4:
				System.out.println("Abril");
				break;
			case 5:
				System.out.println("Maio");
				break;
			case 6:
				System.out.println("Junho");
				break;
			case 7:
				System.out.println("Julho");
				break;
			case 8:
				System.out.println("Agosto");
				break;
			case 9:
				System.out.println("Setembro");
				break;
			case 10:
				System.out.println("Outubro");
				break;
			case 11:
				System.out.println("Novembro");
				break;
			case 12:
				System.out.println("Dezembro");
				break;
			default:
				System.out.println("M�s inv�lido");
				break;
		}
	}
}
