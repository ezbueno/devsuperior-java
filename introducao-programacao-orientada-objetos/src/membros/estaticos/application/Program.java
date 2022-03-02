package membros.estaticos.application;

import java.util.Locale;
import java.util.Scanner;

import membros.estaticos.util.Calculator;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler um valor numérico qualquer, e daí mostrar quanto seria o valor
 * de uma circunferência e do volume de uma esfera para um raio daquele valor. Informar também
 * o valor de PI com duas casas decimais, conforme exemplo:
 * Enter radius: 3.0
 * Circumference: 18.85
 * Volume: 113.10
 * PI value: 3.14
 */
public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter radius: ");
			double radius = sc.nextDouble();

			double c = Calculator.circumference(radius);
			double v = Calculator.volume(radius);

			System.out.printf("Circumference: %.2f%n", c);
			System.out.printf("Volume: %.2f%n", v);
			System.out.printf("PI value: %.2f%n", Calculator.PI);
		}
	}
}
