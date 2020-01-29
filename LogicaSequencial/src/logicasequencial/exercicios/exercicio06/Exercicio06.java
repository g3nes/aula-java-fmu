package logicasequencial.exercicios.exercicio06;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		String numero;
		String numeroInvertido = "";
		System.out.println("Digite um n�mero inteiro de 3 algarismos: ");
		
		Scanner scanner = new Scanner(System.in); 
		numero =  scanner.next();
		scanner.close();
		
		if (numero.length() != 3) {
			System.out.println("ERRO: � preciso informar um n�mero de 3 algarismos.");
			return;
		}
		
		for(char n : numero.toCharArray()) {
			numeroInvertido = n + numeroInvertido;
		}
		
		System.out.println("O numero invertido �: " + numeroInvertido);

	}

}
