package matrizes;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler um número inteiro N e uma matriz de ordem N contendo números inteiros.
 * Em seguida, mostrar a diagonal principal e a quantidade de valores negativos da matriz.
 * Example:
 * Input:
 * 3
 * 5 -3 10
 * 15 8 2
 * 7 9 4
 * Output:
 * Main diagonal:
 * 5 8 -4
 * Negative numbers = 2
 */
public class Program {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			int[][] mat = new int[n][n];
			int negativeNumbers = 0;

			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					mat[i][j] = sc.nextInt();

					if (mat[i][j] < 0) {
						negativeNumbers++;
					}
				}
			}

			System.out.println("Main diagonal:");
			for (int i = 0; i < mat.length; i++) {
				System.out.print(mat[i][i] + " ");
			}

			System.out.println();
			System.out.println("Negative numbers = " + negativeNumbers);
		}
	}
}
