package EstruturasCondicionais.ListaExercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {				
		double altura, pesoIdeal = 0;
		String nome;
		char sexo = 'n';
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = sc.next();
		
		System.out.println("Digite sua altura: ");
		altura = sc.nextDouble();
		
		System.out.println("Qual é seu sexo: F | M : ");
		sexo = sc.next().toUpperCase().charAt(0);
		
		sc.close();
		
		if (sexo == 'M') {
			pesoIdeal = (72.7 * altura) - 58;
		}
		else if (sexo == 'F') {
			pesoIdeal = (62.1 * altura) - 44.7; 
		}
		
		System.out.printf(nome + ", seu peso ideal é: %.2f", pesoIdeal);
	}

}
