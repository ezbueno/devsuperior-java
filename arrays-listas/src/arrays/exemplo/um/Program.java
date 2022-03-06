package arrays.exemplo.um;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler um número inteiro N e a altura de N pessoas. Armazene as N alturas
 * em um vetor. Em seguida, mostrar a altura média dessas pessoas.
 * Input:
 * 3
 * 1.72
 * 1.56
 * 1.80
 * Output:
 * AVERAGE HEIGHT = 1.69
 */
public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			double[] vect = new double[n];
			double sum = 0.0;
			double average;

			for (int i = 0; i < vect.length; i++) {
				vect[i] = sc.nextDouble();
				sum += vect[i];
			}

			average = sum / vect.length;
			System.out.printf("AVERAGE HEIGHT = %.2f%n", average);
		}
	}
}
