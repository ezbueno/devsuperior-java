package estruturafor.exercicios.propostos;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste 
 * de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes 
 * conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem 
 * peso 5.
 * Entrada:
 * 3
 * 6.5 4.3 6.2
 * 5.1 4.2 8.1
 * 8.0 9.0 10.0
 * Saída:
 * 5.7
 * 6.3
 * 9.3
 */
public class ExercicioTres {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			double peso1 = 2.0;
			double peso2 = 3.0;
			double peso3 = 5.0;
			double somaPesos = peso1 + peso2 + peso3;

			for (int i = 0; i < n; i++) {
				double mediaPonderada = 0.0;
				double x1 = sc.nextDouble();
				double x2 = sc.nextDouble();
				double x3 = sc.nextDouble();
				mediaPonderada = ((x1 * peso1) + (x2 * peso2) + (x3 * peso3)) / somaPesos;
				System.out.printf("%.1f%n", mediaPonderada);
			}
		}
	}
}
