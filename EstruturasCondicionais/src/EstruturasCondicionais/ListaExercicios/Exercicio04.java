package EstruturasCondicionais.ListaExercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		double salario, valorVendas, comissao;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o salário fixo do vendedor: ");
		salario = sc.nextDouble();
		
		System.out.println("Informe o valor das vendas efetuadas pelo vendedor: ");
		valorVendas = sc.nextDouble();
		sc.close();
		
		if (valorVendas <= 1500) {
			comissao = valorVendas * 0.03;
		}
		else {
			comissao = (1500 * 0.03) + ((valorVendas - 1500) * 0.05);
		}
		
		System.out.printf("O salário final do vendedor é R$ %.2f", salario + comissao);
	}

}
