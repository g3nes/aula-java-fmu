package EstruturasCondicionais.ListaExercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		double litros, valorTotal, desconto;
		char tipo;
		String combustivel;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Litros: ");
		litros = sc.nextDouble();
		
		System.out.println("Tipo combustível: ");
		tipo = sc.next().toUpperCase().charAt(0);
		
		sc.close();
		
		if(tipo == 'A') {
			combustivel = "Álcool";
			valorTotal = litros * 2.9;
			
			if(litros <= 20)
				desconto = valorTotal * 0.03;
			else
				desconto = valorTotal * 0.05;
			
			valorTotal = valorTotal - desconto;
		}
		else {
			combustivel = "Gasolina";
			valorTotal = litros * 3.3;
			
			if(litros <= 20)
				desconto = valorTotal * 0.04;
			else
				desconto = valorTotal * 0.06;
			
			valorTotal = valorTotal - desconto;
		}
		
		System.out.printf("%.1f litros de %s ficam R$ %.2f", litros, combustivel, valorTotal);
			
	}

}
