package estruturafor;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Fazer um programa que lê um valor inteiro N e depois N números inteiros.
 * Ao final, mostre a soma dos N números lidos, conforme exemplo.
 * Entrada:
 * 3
 * 5
 * 2
 * 4
 * Saída:
 * 11
 */
public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			
			int soma = 0;

			for (int i = 0; i < n; i++) {
				int x = sc.nextInt();
				soma += x;
			}

			System.out.println(soma);
		}
	}
}
