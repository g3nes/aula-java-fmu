package EstruturasCondicionais.ListaExercicios;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {		
		int dia, mes, ano, x, resultado;
		String diaSemana;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o dia: ");
		dia = sc.nextInt();
		
		System.out.println("Informe o mês (1-12): ");
		mes = sc.nextInt();
		
		System.out.println("Informe o ano: ");
		ano = sc.nextInt();
		
		sc.close();
		
		if(mes >= 3) {
			mes = mes - 2;
			x = 8;
		}
		else {
			ano = ano - 1;
			x = 13;
		}
		
		resultado = (x + dia + (31 * mes/ 12) + ((5 * ano) / 4) - (3 * (1 + ano /100) / 4));
		
		resultado = resultado % 7;
			
		if(resultado == 1)
			diaSemana = "Domingo";
		else if(resultado == 2)
			diaSemana = "Segunda-feira";
		else if(resultado == 3)
			diaSemana = "Terça-feira";
		else if(resultado == 4)
			diaSemana = "Quarta-feira";
		else if(resultado == 5)
			diaSemana = "Quinta-feira";
		else if(resultado == 6)
			diaSemana = "Sexta-feira";
		else if(resultado == 7)
			diaSemana = "Sábado";
		else
			diaSemana = "Erro";
		
		System.out.println("O dia é: " + diaSemana);
	}
}
