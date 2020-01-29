package Calculadora;

import java.util.Scanner;

public class JavaCalculadoraAps {
	public static void main(String[] args) {
		int opcao = 0;
		double n1, n2, resultado = 0;
		Scanner entrada = new Scanner(System.in);

		while (opcao != 5) {
			System.out.println("(1) - Adi��o");
			System.out.println("(2) - Subtra��o");
			System.out.println("(3) - Multiplica��o");
			System.out.println("(4) - Divis�o");
			System.out.println("(5) - Sair");

			System.out.print("Digite a opera��o desejada: ");
			opcao = entrada.nextInt();

			if (opcao == 5) {
				System.out.println("Fim do programa. ");
				entrada.close();
				return;
			}

			System.out.println("Digite o primeiro n�mero: ");
			n1 = entrada.nextDouble();

			System.out.println("Digite o segundo n�mero: ");
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
				System.out.println("Op��o inv�lida");
				continue;
			}

			System.out.println("O resultado � : " + resultado);
		}

		entrada.close();

	}
}