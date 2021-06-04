package lacoCondicional;
/*Função: Exercício 3 Laço Condicional else if
 * Autora: Talu - Turma 25
 * Data: 03.06.2021
*/
import java.util.Scanner;

public class exercicio3 {
	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		int idade;

		System.out.println("Insira sua idade: ");
		idade = entrada.nextInt();
		
		if(idade >= 10 && idade <=14) {
			System.out.println("Você pertence ao grupo Infantil.");
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.println("Você pertence ao grupo Juvenil.");
		}
		else if(idade >= 18 && idade <= 25) {
		System.out.println("Você pertence ao grupo Adulto.");
		}
		else if(idade <10) {
			System.out.println("Você pertence a um grupo não listado.");
		}
		else if(idade >= 26) {
		System.out.println("Você pertence a um grupo não listado.");
		}
	}
}
