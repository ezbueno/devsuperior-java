package exercicios.propostos;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
 * Entrada:
 * 12
 * Saída:
 * PAR
 * Entrada:
 * -27
 * Saída:
 * ÍMPAR
 * Entrada:
 * 0
 * Saída:
 * PAR
 */
public class ExercicioDois {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int x = sc.nextInt();

			if (x % 2 == 0) {
				System.out.println("PAR");
			} else {
				System.out.println("ÍMPAR");
			}
		}
	}
}
