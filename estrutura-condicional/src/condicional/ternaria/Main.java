package condicional.ternaria;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			double preco = 34.5;
			double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

			System.out.println(desconto);
		}
	}
}