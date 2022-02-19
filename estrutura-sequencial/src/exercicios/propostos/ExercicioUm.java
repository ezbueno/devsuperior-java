package exercicios.propostos;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
 * mensagem explicativa, conforme exemplos.
 * Entrada:
 * 10
 * 30
 * Saída:
 * SOMA = 40
 * Entrada:
 * -30
 * 10
 * Saída:
 * SOMA = -20
 * Entrada:
 * 0
 * 0
 * SOMA = 0
 */
public class ExercicioUm {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int soma = n1 + n2;
			
			System.out.println("SOMA = " + soma);
		}
	}
}
