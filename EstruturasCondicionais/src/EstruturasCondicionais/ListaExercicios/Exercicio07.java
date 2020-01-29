package EstruturasCondicionais.ListaExercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		int valor1, valor2, valor3, valorFinal;
		
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
				valorFinal = valor1 + valor2;
			else
				valorFinal = valor1 + valor3;
		}
		else if (valor2 > valor1 && valor2 > valor3) {
			if (valor1 > valor3)
				valorFinal = valor2 + valor1;
			else
				valorFinal = valor2 + valor3;
		}
		else {
			if (valor1 > valor2)
				valorFinal = valor3 + valor1;
			else
				valorFinal = valor3 + valor2;
		}
		
		System.out.println("A soma dos dois maiores valores é de " + valorFinal);
	}

}
