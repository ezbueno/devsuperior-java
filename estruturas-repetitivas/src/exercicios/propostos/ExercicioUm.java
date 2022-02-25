package exercicios.propostos;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha 
 * incorreta informada, escrever a mensagem "Senha Inválida". Quando a senha for informada corretamente deve ser 
 * impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
 */
public class ExercicioUm {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int senha = sc.nextInt();

			while (senha != 2002) {
				System.out.println("Senha Inválida");
				senha = sc.nextInt();
			}

			System.out.println("Acesso Permitido");
		}
	}
}
