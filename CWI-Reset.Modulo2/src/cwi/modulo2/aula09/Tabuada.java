package cwi.modulo2.aula09;

import java.util.Scanner;

public class Tabuada {
	public static void main(String [] args) {
		
		Scanner scan = new Scanner (System.in);
		
		
		
		System.out.println("Informe um número para a tabuada de 0 a 10 :");
		int tabuada = scan.nextInt();
		
		System.out.println("Tabuada do " + tabuada + " :");
		System.out.println("");
		
		for (int i = 0; i <= 10; i++) {
			
			int resultado = tabuada * i;
			
			System.out.println(tabuada + " x " + i + " = " + resultado);
			
			
			
			
		}
		
		
		
		
		
		
	}

}
