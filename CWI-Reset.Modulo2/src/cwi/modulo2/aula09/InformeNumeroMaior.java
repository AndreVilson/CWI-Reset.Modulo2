package cwi.modulo2.aula09;

import java.util.Scanner;

public class InformeNumeroMaior {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int maior = Integer.MIN_VALUE;
		int numero = 0;

		for (int i = 0; i < 5; i++) {
			System.out.print("Informe o número " + i + " : ");
			numero = scan.nextInt();

			if (maior < numero) {
				maior = numero;
			}

		}
		System.out.println("Maior número : " + maior);

	}

}
