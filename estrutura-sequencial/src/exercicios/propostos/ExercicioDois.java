package exercicios.propostos;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Faça um programa para ler o valor do raio de um círculo e depois mostrar o valor da área deste círculo com quatro 
 * casas decimais, conforme exemplos.
 * Fórmula da área: area = π . raio2
 * Considere o valor de π = 3.14159
 * Entrada:
 * 2.00
 * Saída:
 * A = 12.5664
 * Entrada:
 * 100.64
 * Saída:
 * A = 31819.3103
 * Entrada:
 * 150.00
 * Saída:
 * A = 70685.7750
 */
public class ExercicioDois {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		final double PI = 3.14159;

		try (Scanner sc = new Scanner(System.in)) {
			double raio = sc.nextDouble();
			double area = PI * Math.pow(raio, 2);

			System.out.printf("A = %.4f%n", area);
		}
	}
}
