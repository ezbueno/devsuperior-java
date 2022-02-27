package estruturaDoWhile;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente 
 * em Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário
 * digite "s", repetir o programa.
 * Fórmula: F = (9c / 5.0) + 32.0
 * Exemplo:
 * Digite a temperatura em Celsius: 30.0
 * Equivalente em Fahrenheit: 86.0
 * Deseja repetir (s/n)? s
 * Digite a temperatura em Celsius: 21.0
 * Equivalente em Fahrenheit: 69.8
 * Deseja repetir (s/n)? s
 * Digite a temperatura em Celsius: -10.5
 * Equivalente em Fahrenheit: 13.1
 * Deseja repetir (s/n)? n
 */
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {
			char opcao;

			do {
				System.out.print("Digite a temperatura em Celsius: ");
				double c = sc.nextDouble();

				double f = ((9 * c) / 5.0) + 32.0;
				System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);

				System.out.print("Deseja repetir (s/n)? ");
				opcao = sc.next().charAt(0);
			} while (opcao != 'n');
		}
	}
}
