package logicasequencial.exercicios.exercicio04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		float salarioFixo, salarioFinal, valorTotalVendas, comissaoFixa;
		float porcentagemComissao = 0.05f;
		int totalCarrosVendidos;
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("Informe a quantidade de carros vendidos: ");
		totalCarrosVendidos = scanner.nextInt();
		
		System.out.println("Informe o valor total de vendas: R$ ");
		valorTotalVendas = scanner.nextFloat();
		
		System.out.println("Informe seu salário: R$ ");
		salarioFixo = scanner.nextFloat();
		
		System.out.println("Informe a comissão fixa: R$ ");
		comissaoFixa = scanner.nextFloat();
		scanner.close();
		
		salarioFinal = salarioFixo + (comissaoFixa * totalCarrosVendidos) + (valorTotalVendas * porcentagemComissao); 
		System.out.printf("O valor do salário final é de: R$ %.2f", salarioFinal);
	}

}
