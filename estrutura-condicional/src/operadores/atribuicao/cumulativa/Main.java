package operadores.atribuicao.cumulativa;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de telefone.
 * Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a quantiade
 * de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago.
 * Entrada:
 * 22
 * Saída:
 * Valor a pagar: R$ 50.00
 * Entrada:
 * 103
 * Saída:
 * Valor a pagar: R$ 56.00
 * 
 */
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {
			int minutos = sc.nextInt();
			
			double conta = 50.0;
			
			if (minutos > 100) {
				conta += (minutos - 100) * 2.0;
			}
			
			System.out.printf("Valor a pagar: R$ %.2f%n", conta);
		}
	}
}
