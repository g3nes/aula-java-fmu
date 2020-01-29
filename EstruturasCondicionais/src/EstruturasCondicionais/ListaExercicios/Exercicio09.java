package EstruturasCondicionais.ListaExercicios;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		double lado1, lado2, lado3;
		boolean trianguloValido = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro lado: ");
		lado1 = sc.nextDouble();
		
		System.out.println("Informe  o segundo lado: ");
		lado2 = sc.nextDouble();
		
		System.out.println("Informe o terceiro lado: ");
		lado3 = sc.nextDouble();
		
		sc.close();
		
		if ((lado1 + lado2) > lado3 && (lado1 + lado3) > lado2 && (lado2 + lado3) > lado1)
			trianguloValido = true;
		
		if (trianguloValido)
			System.out.println("É um triângulo válido!");
		else
			System.out.println("Não é um triângulo válido!");
	}

}
