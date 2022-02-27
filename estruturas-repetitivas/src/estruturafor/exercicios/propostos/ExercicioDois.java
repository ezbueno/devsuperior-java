package estruturafor.exercicios.propostos;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
 * Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando 
 * essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
 * Entrada:
 * 5
 * 14
 * 123
 * 10
 * -25
 * 32
 * Saída:
 * 2 in
 * 3 out
 */
public class ExercicioDois {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			int in = 0;
			int out = 0;

			for (int i = 0; i < n; i++) {
				int x = sc.nextInt();

				if (x >= 10 && x <= 20) {
					in++;
				} else {
					out++;
				}
			}

			System.out.println(in + " in");
			System.out.println(out + " out");
		}
	}
}
