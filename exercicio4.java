package lacoCondicional;

import java.util.Scanner;

public class exercicio4 {
	
	private static Scanner scanner;

	public static void main(String[] args) {
		
		int n; //numero que será inserido e lido pelo programa
		double elevado;
		
		System.out.println("Digite um número: ");
		scanner = new Scanner(System.in);
		n = scanner.nextInt();
		
		if (n%2==0) {
			System.out.println("Esse número é Par.");
			Math.sqrt(n);
			System.out.println("A raiz do número é: ");
		}
		else if (n%2==1) {
			System.out.println("Esse número é Ímpar!");
			elevado = Math.pow(n,2);
			System.out.println("O quadrado do número é: " + elevado);
		}
		}
}
