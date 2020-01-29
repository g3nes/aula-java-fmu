package Calculadora;

import java.util.Scanner;

public class JavaCalculadoraAps {
	public static void main(String[] args) {
		int opcao = 0;
		double n1, n2, resultado = 0;
		Scanner entrada = new Scanner(System.in);

		while (opcao != 5) {
			System.out.println("(1) - Adição");
			System.out.println("(2) - Subtração");
			System.out.println("(3) - Multiplicação");
			System.out.println("(4) - Divisão");
			System.out.println("(5) - Sair");

			System.out.print("Digite a operação desejada: ");
			opcao = entrada.nextInt();

			if (opcao == 5) {
				System.out.println("Fim do programa. ");
				entrada.close();
				return;
			}

			System.out.println("Digite o primeiro número: ");
			n1 = entrada.nextDouble();

			System.out.println("Digite o segundo número: ");
			n2 = entrada.nextDouble();

			switch (opcao) {
			case 1:
				resultado = n1 + n2;
				break;

			case 2:
				resultado = n1 - n2;
				break;

			case 3:
				resultado = n1 * n2;
				break;

			case 4:
				resultado = n1 / n2;
				break;

			default:
				System.out.println("Opção inválida");
				continue;
			}

			System.out.println("O resultado é : " + resultado);
		}

		entrada.close();

	}
}