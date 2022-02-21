package exercicios.propostos;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "São Múltiplos" ou "Não são 
 * Múltiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
 * ordem crescente ou decrescente.
 */
public class ExercicioTres {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int maior = Math.max(a, b);
			int menor = Math.min(a, b);
			
			if (maior % menor == 0) {
				System.out.println("São Múltiplos");
			} else {
				System.out.println("Não são Múltiplos");
			}
		}
	}
}
