package lacoCondicional;

import java.util.Scanner;

public class exercicio1 {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
		int n1;
		int n2;
		int n3;
		
		System.out.println("Digite 3 números: ");
		n1 = entrada.nextInt();	
		n2 = entrada.nextInt();	
		n3 = entrada.nextInt();	
		
		if(n1 >= n2 && n1 >= n3) {
		System.out.println("O maior número é: " + n1);
		}
		else if (n2 >= n1 && n2 >= n3) {
			System.out.println("O maior número é: " + n2);
		}
		else if (n3 >= n2 && n3 >= n1) {
			System.out.println("O maior número é: " + n3);
		}
	}
}