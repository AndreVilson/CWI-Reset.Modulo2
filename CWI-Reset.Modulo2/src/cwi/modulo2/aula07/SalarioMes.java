package cwi.modulo2.aula07;

import java.util.Scanner;

public class SalarioMes {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite seu salário/hora :");
		double salarioHora = scan.nextDouble();

		System.out.println("Digite as horas trabalhadas no mês :");
		double HorasTrabalhadas = scan.nextDouble();

		double salarioMes = salarioHora * HorasTrabalhadas;

		System.out.println("Salário deste mês é : " + salarioMes);

	}

}
