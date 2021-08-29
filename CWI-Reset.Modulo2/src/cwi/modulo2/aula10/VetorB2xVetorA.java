package cwi.modulo2.aula10;

import java.util.Scanner;

public class VetorB2xVetorA {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		
		int [] vetorA = new int [5];
		int [] vetorB = new int [vetorA.length];
		
		
		
		for (int i = 0; i < vetorA.length; i++) {
			
			System.out.print("Informe o valor da posição " + i + " : ");
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i] * 2;
		}
		
		System.out.println("vetorA");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(" " + vetorA[i]);
		}
		System.out.println("");
		System.out.println("vetorB");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(" " + vetorB[i]);
		}
		
		
		
		
		
		
	}

}
