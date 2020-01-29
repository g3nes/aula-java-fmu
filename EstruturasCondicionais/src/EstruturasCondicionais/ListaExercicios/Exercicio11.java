package EstruturasCondicionais.ListaExercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		int valor1, valor2;
		String mensagem;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor 1: ");
		valor1 = sc.nextInt();
		
		System.out.println("Valor 2: ");
		valor2 = sc.nextInt();
		
		sc.close();
		
		if(valor1 > valor2)
			mensagem = "Primeiro é maior";
		else if(valor2 > valor1)
			mensagem = "Segundo é maior";
		else
			mensagem = "Número iguais";
		
		System.out.println(mensagem);			
	}

}
