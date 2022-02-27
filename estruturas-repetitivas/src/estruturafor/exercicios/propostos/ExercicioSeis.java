package estruturafor.exercicios.propostos;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Ler um número inteiro N e calcular todos os seus divisores.
 * Entrada:
 * 6
 * Saída:
 * 1
 * 2
 * 3
 * 6
 */
public class ExercicioSeis {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					System.out.println(i);
				}
			}
		}
	}
}
