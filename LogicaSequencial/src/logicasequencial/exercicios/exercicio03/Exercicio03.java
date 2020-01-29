package logicasequencial.exercicios.exercicio03;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		float custoFabrica, custoFinal;

		System.out.println("Informe o custo de fábrica do veículo: R$ ");
		
		Scanner scanner = new Scanner(System.in);
		custoFabrica = scanner.nextFloat();
		scanner.close();
		
		custoFinal = CalcularCustoFinal(custoFabrica);
		
		System.out.printf("O custo final ao consumidor é: R$ %.2f", custoFinal);
	}
	
	private static float CalcularCustoFinal(float custoFabrica) {		
		float porcentagemDistribuidor = 0.28f;
		float porcentagemImpostos = 0.45f;
		
		return custoFabrica + 
				(custoFabrica * porcentagemDistribuidor) + 
				(custoFabrica * porcentagemImpostos);
	}
}
