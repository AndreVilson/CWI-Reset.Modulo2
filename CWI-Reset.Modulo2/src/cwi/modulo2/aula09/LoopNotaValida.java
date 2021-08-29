package cwi.modulo2.aula09;

import java.util.Scanner;

public class LoopNotaValida {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean notaValida = false;

		while (notaValida == false) {

			System.out.print("Informe uma nota de 0 a 10 :");
			int nota = scan.nextInt();

			if (nota < 0) {
				System.out.println("Nota inválida, menor que 0 :");
			} else if (nota > 10) {
				System.out.println("Nota inválida, maior que 10 :");
			} else if (nota >= 0 && nota <= 10) {
				System.out.println("Nota " + nota);
				notaValida = true;
			}

		}

	}

}
