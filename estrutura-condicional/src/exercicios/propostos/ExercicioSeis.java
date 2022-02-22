package exercicios.propostos;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos 
 * seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em 
 * nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
 * Entrada:
 * 25.01
 * Saída:
 * Intervalo (25,50]
 * Entrada:
 * 25.00
 * Saída:
 * Intervalo (0,25]
 * Entrada:
 * 100.00
 * Saída:
 * Intervalo (75,100]
 * Entrada:
 * -25.02
 * Saída:
 * Fora de intervalo
 */
public class ExercicioSeis {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {
			double x = sc.nextDouble();

			if (x > 25.0 && x <= 50.0) {
				System.out.println("Intervalo (25,50]");
			} else if (x >= 0.0 && x <= 25.0) {
				System.out.println("Intervalo [0,25]");
			} else if (x >= 75.0 && x <= 100.0) {
				System.out.println("Intervalo (75,100]");
			} else {
				System.out.println("Fora de intervalo");
			}
		}
	}
}
