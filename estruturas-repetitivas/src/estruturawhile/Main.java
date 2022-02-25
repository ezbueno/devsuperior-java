package estruturawhile;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Fazer um programa que lê números inteiros até que um zero seja lido. Ao final, mostre a soma dos números lidos.
 * Entrada:
 * 5
 * 2
 * 4
 * 0
 * Saída:
 * 11
 */
public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int numero = sc.nextInt();
			int soma = 0;

			while (numero != 0) {
				soma += numero;
				numero = sc.nextInt();
			}

			System.out.println(soma);
		}
	}
}
