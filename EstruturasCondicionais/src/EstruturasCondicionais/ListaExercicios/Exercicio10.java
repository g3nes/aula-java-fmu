package EstruturasCondicionais.ListaExercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		String timeA, timeB;
		int golsA, golsB;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Time A: ");
		timeA = sc.next();
		
		System.out.println("Time B: ");
		timeB = sc.next();
		
		System.out.println("Gols time A: ");
		golsA = sc.nextInt();
		
		System.out.println("Gols time B: ");
		golsB = sc.nextInt();
		
		sc.close();
		
		if(golsA > golsB)
			System.out.println(timeA + " venceu!");
		else if(golsB > golsA)
			System.out.println(timeB + " venceu!");
		else
			System.out.println("EMPATE");
	}

}
