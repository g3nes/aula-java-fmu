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
		
		System.out.println("Informe seu sal�rio: R$ ");
		salarioFixo = scanner.nextFloat();
		
		System.out.println("Informe a comiss�o fixa: R$ ");
		comissaoFixa = scanner.nextFloat();
		scanner.close();
		
		salarioFinal = salarioFixo + (comissaoFixa * totalCarrosVendidos) + (valorTotalVendas * porcentagemComissao); 
		System.out.printf("O valor do sal�rio final � de: R$ %.2f", salarioFinal);
	}

}
