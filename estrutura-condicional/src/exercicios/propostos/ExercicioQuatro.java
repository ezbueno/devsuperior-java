package exercicios.propostos;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
 * começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 * Entrada:
 * 16 2
 * Saída:
 * O JOGO DUROU 10 HORA(S)
 * Entrada:
 * 0 0
 * Saída:
 * O JOGO DUROU 24 HORA(S)
 * Entrada:
 * 2 16
 * Saída:
 * O JOGO DUROU 14 HORA(S)
 */
public class ExercicioQuatro {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int duracao = 0;
			int duracaoMaxima = 24;

			int horaInicial = sc.nextInt();
			int horaFinal = sc.nextInt();

			if (horaInicial == horaFinal) {
				System.out.println("O JOGO DUROU " + duracaoMaxima + " HORA(S)");
			} else if (horaInicial > horaFinal) {
				duracao = (duracaoMaxima - horaInicial) + horaFinal;
				System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
			} else {
				duracao = horaFinal - horaInicial;
				System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
			}
		}
	}
}
