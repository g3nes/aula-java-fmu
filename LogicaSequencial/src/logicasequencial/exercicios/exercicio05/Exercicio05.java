package logicasequencial.exercicios.exercicio05;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		int minutos, horas, idade, meses, dias;		
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Digite sua idade: ");
		idade = scanner.nextInt();
		scanner.close();
		
		meses = idade * 12;
		System.out.println("A sua idade em meses � de: " + meses + " meses.");
		
		dias = idade * 365;
		System.out.println("A sua idade em dias � de: " + dias + " dias.");
		
		horas = dias * 24;
		System.out.println("A sua idade em horas � de: " + horas +  " horas.");
		
		minutos = horas * 60 ; 
		System.out.println("A sua idade em minutos � de : " + minutos +  " minutos.");
	}

}
