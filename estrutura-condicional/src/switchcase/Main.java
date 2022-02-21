package switchcase;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da semana (sendo 1 = domingo, 2 = segunda, e assim por diante).
 * Escrever na tela o dia da semana correspondente, conforme exemplos:
 * Entrada:
 * 1
 * Saída:
 * Dia da semana: domingo
 * Entrada:
 * 4
 * Saída:
 * Dia da semana: quarta
 * Entrada:
 * 9
 * Saída:
 * Dia da semana: valor inválido
 */
public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int x = sc.nextInt();

			String diaSemana;

			switch (x) {
			case 1:
				diaSemana = "domingo";
				break;
			case 2:
				diaSemana = "segunda";
				break;
			case 3:
				diaSemana = "terça";
				break;
			case 4:
				diaSemana = "quarta";
				break;
			case 5:
				diaSemana = "quinta";
				break;
			case 6:
				diaSemana = "sexta";
				break;
			case 7:
				diaSemana = "sábado";
				break;
			default:
				diaSemana = "valor inválido";
			}

			System.out.println("Dia da semana: " + diaSemana);
		}
	}
}
