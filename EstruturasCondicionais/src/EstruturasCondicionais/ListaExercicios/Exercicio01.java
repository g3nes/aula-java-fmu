package EstruturasCondicionais.ListaExercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		int maca;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de ma��s compradas: ");
		maca = sc.nextInt();
		sc.close();
		
		if ((maca >= 1) && (maca <= 11)){
			System.out.println("Dever� pagar: " + (maca * 1.3) + " reais" );
		}
		else {
			System.out.println("Dever� pagar: " + maca + " reais" );
		}
	}

}
