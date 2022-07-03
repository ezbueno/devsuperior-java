package introducao.generics.application;

import java.util.Scanner;

import introducao.generics.services.PrintService;

/**
 * @author Ezandro Bueno
 * Fazer um programa que leia uma quantidade N e depois N números
 * inteiros. Ao final, imprima esses números de forma organizada,
 * conforme exemplo. Em seguida, informar qual foi o primeiro valor
 * informado.
 */
public class Program {
	public static void main(String[] args) {
		PrintService<Integer> printService = new PrintService<>();

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("How many values? ");
			int n = sc.nextInt();

			for (int i = 0; i < n; i++) {
				int value = sc.nextInt();
				printService.addValue(value);
			}

			printService.print();
			System.out.println("First: " + printService.first());
		}
	}
}
