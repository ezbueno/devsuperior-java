package exercicios.propostos;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
 * código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */
public class ExercicioCinco {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		try (Scanner sc = new Scanner(System.in)) {
			@SuppressWarnings("unused")
			int codPeca1 = sc.nextInt();
			
			int numPecas1 = sc.nextInt();
			double valorUnitarioPeca1 = sc.nextDouble();
			
			@SuppressWarnings("unused")
			int codPeca2 = sc.nextInt();
			
			int numPecas2 = sc.nextInt();
			double valorUnitarioPeca2 = sc.nextDouble();
			
			double valorASerPago = (numPecas1 * valorUnitarioPeca1) + (numPecas2 * valorUnitarioPeca2);
			
			System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorASerPago);
		}
	}
}
