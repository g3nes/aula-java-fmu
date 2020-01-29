package EstruturasCondicionais.ListaExercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		int horasTrabalhadas, horasExtras = 0;
		double salarioHora, salarioExtra, salarioFinal;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite a quantidade de horas trabalhadas: ");
		horasTrabalhadas = sc.nextInt();
		
		System.out.print("Digite o valor/hora: R$ ");
		salarioHora = sc.nextDouble();
		
		sc.close();
		
		salarioFinal = horasTrabalhadas * salarioHora;
		
		if (horasTrabalhadas >= 40) {
			horasExtras = horasTrabalhadas - 40;
			salarioExtra = salarioHora + (salarioHora * 0.5);
			salarioFinal = salarioFinal + (horasExtras * salarioExtra);
		}
				
		System.out.printf("Salário final: R$ %.2f", salarioFinal);
	}

}
