package exercicios.propostos;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
 * de A e B pelo produto de C e D segundo a fórmula: DIFERENÇA = (A * B - C * D).
 */
public class ExercicioTres {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			
			int diferenca = (a * b) - (c * d);
			
			System.out.println("DIFERENÇA = " + diferenca);
		}
	}
}
