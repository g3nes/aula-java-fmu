package logicasequencial.exercicios.exercicio07;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio07 {

	public static void main(String[] args) {
		String numero;
		int resultado = 0;
		
		System.out.println("Digite um número binário de 5 dígitos: ");
		Scanner scanner = new Scanner(System.in); 
		numero =  scanner.next();
		scanner.close();
		
		if (numero.length() != 5) {
			System.out.println("ERRO: É preciso informar um número de 5 algarismos.");
			return;
		}
		
		String[] numeros = numero.split("");
		
		for (int i = numeros.length - 1, j = 0; i >= 0; i--, j++) {
			resultado += Integer.parseInt(numeros[i]) * Math.pow(2, j);
		}
		
		System.out.println("O número em base decimal é: " + resultado );			
	}

}
