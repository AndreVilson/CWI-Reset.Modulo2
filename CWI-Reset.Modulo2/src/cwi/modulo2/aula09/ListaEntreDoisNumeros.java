package cwi.modulo2.aula09;

import java.util.Scanner;

public class ListaEntreDoisNumeros {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o primeiro número :");
		int primeiro = scan.nextInt();

		boolean segundoValido = false;

		while (segundoValido == false) {

			System.out.println("Informe o segundo número :");
			int segundo = scan.nextInt();

			if (primeiro < segundo) {

				for (int i = primeiro; i <= segundo; i++) {

					System.out.println(i);

				}
				segundoValido = true;
			} else {
				System.out.println("Segundo  menor que o primeiro:");
			}

		}

	}

}
