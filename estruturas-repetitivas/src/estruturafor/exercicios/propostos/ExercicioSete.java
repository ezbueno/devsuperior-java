package estruturafor.exercicios.propostos;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, 
 * começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme 
 * exemplo.
 * Entrada:
 * 5
 * Saída:
 * 1 1 1
 * 2 4 8
 * 3 9 27
 * 4 16 64
 * 5 25 125
 */
public class ExercicioSete {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			for (int i = 1; i <= n; i++) {
				System.out.print(i + " " + (int) Math.pow(i, 2.0) + " " + (int) Math.pow(i, 3.0) + "\n");
			}
		}
	}
}
