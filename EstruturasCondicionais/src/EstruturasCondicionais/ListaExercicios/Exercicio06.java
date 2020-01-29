package EstruturasCondicionais.ListaExercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		/*
		 * 6. Faça um algoritmo/programa para ler: quantidade atual em estoque,
		 * quantidade máxima em estoque e quantidade mínima em estoque de um produto.
		 * Calcular e escrever a quantidade média ((quantidade média = quantidade máxima
		 * + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual à
		 * quantidade média, escrever a mensagem 'Não efetuar compra', senão escrever a
		 * mensagem 'Efetuar compra'
		 */

		Scanner sc = new Scanner(System.in);
		int quantidadeEstoque, quantidadeMaxima, quantidadeMinima, mediaEstoque;
		
		System.out.println("Informe a quantidade atual no estoque: ");
		quantidadeEstoque = sc.nextInt();
		
		System.out.println("Informe a quantidade máxima no estoque: ");
		quantidadeMaxima = sc.nextInt();
		
		System.out.println("Informe a quantidade mínima no estoque: ");
		quantidadeMinima = sc.nextInt();
		
		sc.close();
		
		mediaEstoque = (quantidadeMaxima + quantidadeMinima) / 2;
		
		if (quantidadeEstoque >= mediaEstoque) {
			System.out.println("Não efetuar compra");
		}
		else {
			System.out.println("Efetuar compra");
		}			
	}
}
