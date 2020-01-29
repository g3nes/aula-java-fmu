package EstruturasCondicionais.ListaExercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		int valor1, valor2, valor3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: ");
		valor1 = sc.nextInt();
		
		System.out.println("Informe  o segundo valor: ");
		valor2 = sc.nextInt();
		
		System.out.println("Informe o terceiro valor: ");
		valor3 = sc.nextInt();
		
		sc.close();
		
		if (valor1 > valor2 && valor1 > valor3) {
			if (valor2 > valor3)
				System.out.printf("%d, %d, %d", valor3, valor2, valor1);
			else
				System.out.printf("%d, %d, %d", valor2, valor3, valor1);
		}
		else if (valor2 > valor1 && valor2 > valor3) {
			if (valor1 > valor3)
				System.out.printf("%d, %d, %d", valor3, valor1, valor2);
			else
				System.out.printf("%d, %d, %d", valor1, valor3, valor2);
		}
		else {
			if (valor1 > valor2)
				System.out.printf("%d, %d, %d", valor2, valor1, valor3);
			else
				System.out.printf("%d, %d, %d", valor1, valor2, valor3);
		}

	}

}
