package arrays.exemplo.dois;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler um número inteiro N e os dados (nome e preço) de N produtos.
 * Armazene os N produtos em um vetor. Em seguida, mostrar o preço médio dos produtos.
 * Input:
 * 3
 * TV
 * 900.00
 * Fryer
 * 400.00
 * Stove
 * 800.00
 * Output:
 * AVERAGE PRICE = 700.00
 */
public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		double sum = 0.0;
		double average;

		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			Product[] products = new Product[n];

			for (int i = 0; i < products.length; i++) {
				sc.nextLine();
				String name = sc.nextLine();
				double price = sc.nextDouble();

				products[i] = new Product(name, price);
				sum += products[i].getPrice();
			}

			average = sum / products.length;
			System.out.printf("AVERAGE PRICE = %.2f%n", average);
		}
	}
}
