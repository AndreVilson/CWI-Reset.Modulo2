package cwi.modulo2.aula08;

import java.util.Scanner;

public class MediaComMensagem {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Informe a primeira nota de 0 a 10:");
		double primeiraNota = scan.nextDouble();

		System.out.print("Informe a segunda nota de 0 a 10:");
		double segundaNota = scan.nextDouble();

		System.out.print("Informe a terceira nota de 0 a 10:");
		double terceiraNota = scan.nextDouble();

		System.out.print("Informe a quarta nota de 0 a 10:");
		double quartaNota = scan.nextDouble();

		double media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;

			System.out.println("Média das notas é : " + media);
		if (media == 10) {
			System.out.print("Aluno Aprovado com Louvores");
		} else if (media >= 7 && media < 10) {
			System.out.print("Aluno Aprovado");
		} else if (media > 0 && media < 7) {
			System.out.print("Aluno Reprovado");
		}else {
			System.out.println("Notas inválidas");
		}

	}

}
