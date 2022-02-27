package funcoes;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler três números inteiros e mostrar na tela o maior deles.
 * Exemplo:
 * Enter three numbers:
 * 5
 * 8
 * 3
 * Higher = 8
 */
public class ProblemaExemplo {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter three numbers: ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			int higher = max(a, b, c);

			showResult(higher);
		}
	}

	private static int max(int a, int b, int c) {
		if (a > b && a > c) {
			return a;
		} else if (b > c) {
			return b;
		}
		return c;
	}

	private static void showResult(int higher) {
		System.out.println("Higher = " + higher);
	}
}
