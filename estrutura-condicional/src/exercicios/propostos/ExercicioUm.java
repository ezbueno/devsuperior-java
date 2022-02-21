package exercicios.propostos;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
 * Entrada:
 * -10
 * Saída:
 * NEGATIVO
 * Entrada:
 * 8
 * Saída:
 * NÃO NEGATIVO
 * Entrada:
 * 0
 * Saída:
 * NÃO NEGATIVO
 * 
 */
public class ExercicioUm {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int x = sc.nextInt();

			if (x < 0) {
				System.out.println("NEGATIVO");
			} else {
				System.out.println("NÃO NEGATIVO");
			}
		}
	}
}
