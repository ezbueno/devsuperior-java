package estruturafor.exercicios.propostos;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo 
 * segundo. Se o denominador for igual a zero, mostrar a mensagem "divisão impossível".
 * Entrada:
 * 3
 * 3 -2
 * -8 0
 * 0 8
 * Saída:
 * -1.5
 * divisão impossível
 * 0.0
 */
public class ExercicioQuatro {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			for (int i = 0; i < n; i++) {
				int x1 = sc.nextInt();
				int x2 = sc.nextInt();

				if (x2 == 0) {
					System.out.println("divisão impossível");
				} else {
					double resultado = (double) x1 / x2;
					System.out.println(resultado);
				}
			}
		}
	}
}
