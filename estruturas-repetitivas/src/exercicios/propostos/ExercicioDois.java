package exercicios.propostos;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema 
 * cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo 
 * menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
 * Entrada:
 * 2
 * 2
 * Saída:
 * primeiro
 * Entrada:
 * 3
 * -2
 * Saída:
 * quarto
 * Entrada:
 * -8
 * -1
 * Saída:
 * terceiro
 * Entrada:
 * -7
 * 1
 * Saída:
 * segundo
 * Entrada:
 * 0
 * 2
 * Saída:
 * 
 */
public class ExercicioDois {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			while (x != 0 || y != 0) {
				if (x == 0 || y == 0) {
					break;
				} else if (x > 0 && y > 0) {
					System.out.println("primeiro");
				} else if (x < 0 && y > 0) {
					System.out.println("segundo");
				} else if (x < 0 && y < 0) {
					System.out.println("terceiro");
				} else {
					System.out.println("quarto");
				}

				x = sc.nextInt();
				y = sc.nextInt();
			}
		}
	}
}
