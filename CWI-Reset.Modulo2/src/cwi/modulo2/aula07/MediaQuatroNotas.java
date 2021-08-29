package cwi.modulo2.aula07;

import java.util.Scanner;

public class MediaQuatroNotas {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		
		System.out.print("Digite a primeira nota :");
		double nota1 = scan.nextDouble();
		
		System.out.print("Digite a segunda nota :");
		double nota2 = scan.nextDouble();
		
		System.out.print("Digite a terceira nota :");
		double nota3 = scan.nextDouble();
		
		System.out.println("Digite a quarta nota :");
		double nota4 = scan.nextDouble();
		
		double total = nota1 + nota2 + nota3 + nota4;
		
		double media = total / 4;
		
		System.out.println("Média das notas é : " + media);
	}

}
