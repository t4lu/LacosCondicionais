package lacoCondicional;
/*Função: Exercício 2 Laço Condicional else if
 * Autora: Talu - Turma 25
 * Data: 03.06.2021
*/
import java.util.Scanner;

public class exercicio2 {
	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("Digite os 3 números:");
		n1 = entrada.nextInt();	
		n2 = entrada.nextInt();	
		n3 = entrada.nextInt();	
		
		if(n1 <= n2 && n2 <= n3) {
			System.out.println("A ordem crescente é: "+ n1 + "," + n2 + " e "+ n3);
		}
		else if(n1 <= n3 && n2 <= n3) {
			System.out.println("A ordem crescente é: " +n1 + "," + n3 + " e "+ n2);
		}
		else if(n2 <= n1 && n1 <= n3) {
			System.out.println("A ordem crescente é: " + n2 + "," + n1 + " e "+ n3);
		}
		else if(n2 <= n3 && n2 <= n1) {
			System.out.println("A ordem crescente é: "+ n2 + "," + n3 + " e "+ n1);
		}
		else if(n3 <= n1 && n1 <= n2) {
			System.out.println("A ordem crescente é: " + n3 + "," + n1 + " e "+ n2);
		}
		else {
			System.out.println("A ordem crescente é: " + n3 + "," + n2 + " e "+ n1);
		}

	}

}