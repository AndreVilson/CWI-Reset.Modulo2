package cwi.modulo2.aula10;

import java.util.Scanner;

public class VetorIdades {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] idades = new int[10];

		for (int i = 0; i < idades.length; i++) {

			System.out.print("Informe a idade na posição " + i + " : ");
			idades[i] = scan.nextInt();

		}
		System.out.println("idades");
		for (int i = 0; i < idades.length; i++) {
			System.out.print(" " + idades[i]);
		}

		System.out.println(" ");
		System.out.println("idades igual ou superior a 18 :");
		for (int i = 0; i < idades.length; i++) {
			if (idades[i] >= 18) {
				System.out.print(" " + idades[i]);
			}
		}

	}

}
