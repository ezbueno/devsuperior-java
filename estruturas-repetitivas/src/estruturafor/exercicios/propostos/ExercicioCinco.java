package estruturafor.exercicios.propostos;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
 * Lembrando que, por definição, fatorial de 0 é 1.
 * Entrada:
 * 4
 * Saída:
 * 24
 * Entrada:
 * 1
 * Saída:
 * 1
 * Entrada:
 * 5
 * Saída:
 * 120
 * Entrada:
 * 0
 * Saída:
 * 1
 */
public class ExercicioCinco {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			int fatorial = 1;

			for (int i = n; i >= 1; i--) {
				fatorial *= i;
			}

			System.out.println(fatorial);
		}
	}
}
