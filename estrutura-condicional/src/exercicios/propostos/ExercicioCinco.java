package exercicios.propostos;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A 
 * seguir, calcule e mostre o valor da conta a pagar.
 * Código 	Especificação		Preço
 * 1		Cachorro Quente		R$ 4.00
 * 2		X-Salada		R$ 4.50
 * 3		X-Bacon			R$ 5.00
 * 4		Torrada Simples		R$ 2.00
 * 5		Refrigerante		R$ 1.50
 * Entrada:
 * 3
 * 2
 * Saída:
 * Total: R$ 10.00
 * Entrada:
 * 2
 * 3
 * Saída:
 * Total: R$ 13.50
 */
public class ExercicioCinco {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {
			int codigo = sc.nextInt();
			int quantidade = sc.nextInt();

			double valorTotal = 0.0;

			if (codigo == 1) {
				valorTotal = quantidade * 4.0;
			} else if (codigo == 2) {
				valorTotal = quantidade * 4.5;
			} else if (codigo == 3) {
				valorTotal = quantidade * 5.0;
			} else if (codigo == 4) {
				valorTotal = quantidade * 2.0;
			} else {
				valorTotal = quantidade * 1.5;
			}

			System.out.printf("Total: R$ %.2f%n", valorTotal);
		}
	}
}
