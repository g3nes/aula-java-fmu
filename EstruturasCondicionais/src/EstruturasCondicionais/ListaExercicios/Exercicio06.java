package EstruturasCondicionais.ListaExercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		/*
		 * 6. Fa�a um algoritmo/programa para ler: quantidade atual em estoque,
		 * quantidade m�xima em estoque e quantidade m�nima em estoque de um produto.
		 * Calcular e escrever a quantidade m�dia ((quantidade m�dia = quantidade m�xima
		 * + quantidade m�nima)/2). Se a quantidade em estoque for maior ou igual �
		 * quantidade m�dia, escrever a mensagem 'N�o efetuar compra', sen�o escrever a
		 * mensagem 'Efetuar compra'
		 */

		Scanner sc = new Scanner(System.in);
		int quantidadeEstoque, quantidadeMaxima, quantidadeMinima, mediaEstoque;
		
		System.out.println("Informe a quantidade atual no estoque: ");
		quantidadeEstoque = sc.nextInt();
		
		System.out.println("Informe a quantidade m�xima no estoque: ");
		quantidadeMaxima = sc.nextInt();
		
		System.out.println("Informe a quantidade m�nima no estoque: ");
		quantidadeMinima = sc.nextInt();
		
		sc.close();
		
		mediaEstoque = (quantidadeMaxima + quantidadeMinima) / 2;
		
		if (quantidadeEstoque >= mediaEstoque) {
			System.out.println("N�o efetuar compra");
		}
		else {
			System.out.println("Efetuar compra");
		}			
	}
}
