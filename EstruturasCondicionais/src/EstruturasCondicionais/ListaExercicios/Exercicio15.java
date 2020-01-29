package EstruturasCondicionais.ListaExercicios;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {		
		int codigo, quantidade;
		String produto;
		double preco;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o código do produto: ");
		codigo = sc.nextInt();
		
		System.out.println("Informe a quantidade: ");
		quantidade = sc.nextInt();
		
		sc.close();
		
		switch(codigo) {
			case 100:
				produto = "Cachorro quente";
				preco = 1.2;
				break;
			case 101:
				produto = "Bauru simples";
				preco = 1.3;
				break;
			case 102:
				produto = "Bauru com ovo";
				preco = 1.5;
				break;
			case 103:
				produto = "Hamburguer";
				preco = 1.2;
				break;
			case 104:
				produto = "Cheeseburguer";
				preco = 1.7;
				break;
			case 105:
				produto = "Suco";
				preco = 2.2;
				break;
			case 106:
				produto = "Refrigerante";
				preco = 1.0;
				break;
			default:
				produto = "Produto inválido";
				preco = 0;
				break;
		}
		
		System.out.printf("%dx %s: R$ %.2f", quantidade, produto, preco * quantidade);
	}

}
