package EstruturasCondicionais.ListaExercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		double saldo, debito, credito, saldoAtual;
		String conta, saldoStatus;
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o n�mero da conta: ");
		conta = sc.next();
		
		System.out.println("Informe o saldo da conta: ");
		saldo = sc.nextDouble();
		
		System.out.println("Informe o d�bito: ");
		debito = sc.nextDouble();
		
		System.out.println("Informe o cr�dito: ");
		credito = sc.nextDouble();
		
		sc.close();
		
		saldoAtual = saldo - debito + credito;
		
		if (saldoAtual >= 0)
			saldoStatus = "Positivo";
		else
			saldoStatus = "Negativo";
		
		System.out.printf("O saldo da conta %s � de R$ %.2f. Saldo %s.", conta, saldoAtual, saldoStatus);
	}

}
