package exercicios.propostos.um;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar na tela
 * o valor de sua área, perímetro e diagonal. Usar uma classe como mostrado no exemplo abaixo:
 * Rectangle
 * - Width: double
 * - Height: double
 * + Area(): double
 * + Perimeter(): double
 * + Diagonal(): double
 * Exemplo:
 * Enter rectangle width and height:
 * 3.00
 * 4.00
 * AREA = 12.00
 * PERIMETER = 14.00
 * DIAGONAL = 5.00
 */
public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {
			Rectangle rectangle = new Rectangle();

			System.out.println("Enter rectangle width and height:");
			rectangle.width = sc.nextDouble();
			rectangle.height = sc.nextDouble();

			System.out.printf("AREA = %.2f%n", rectangle.area());
			System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
			System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());
		}
	}
}
