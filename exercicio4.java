package lacoCondicional;

import java.util.Scanner;

public class exercicio4 {
	
	private static Scanner scanner;

	public static void main(String[] args) {
		
		int n; //numero que ser� inserido e lido pelo programa
		double elevado;
		
		System.out.println("Digite um n�mero: ");
		scanner = new Scanner(System.in);
		n = scanner.nextInt();
		
		if (n%2==0) {
			System.out.println("Esse n�mero � Par.");
			Math.sqrt(n);
			System.out.println("A raiz do n�mero �: ");
		}
		else if (n%2==1) {
			System.out.println("Esse n�mero � �mpar!");
			elevado = Math.pow(n,2);
			System.out.println("O quadrado do n�mero �: " + elevado);
		}
		}
}
