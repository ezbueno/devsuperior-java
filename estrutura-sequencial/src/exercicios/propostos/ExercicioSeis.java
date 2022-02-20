package exercicios.propostos;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
 * mostre: 
 * a) a área do triângulo retângulo que tem A por base e C por altura. 
 * b) a área do círculo de raio C. (pi = 3.14159) 
 * c) a área do trapézio que tem A e B por bases e C por altura. 
 * d) a área do quadrado que tem lado B. 
 * e) a área do retângulo que tem lados A e B.
 * Entrada:
 * 3.0 
 * 4.0 
 * 5.2
 * Saída:
 * TRIÂNGULO= 7.800
 * CÍRCULO = 84.949
 * TRAPÉZIO = 18.200
 * QUADRADO = 16.000
 * RETÂNGULO = 12.000
 * Entrada:
 * 12.7
 * 10.4
 * 15.2
 * Saída:
 * TRIÂNGULO= 96.520
 * CÍRCULO = 725.833
 * TRAPÉZIO = 175.560
 * QUADRADO = 108.160
 * RETÂNGULO = 132.080
 */
public class ExercicioSeis {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		final double PI = 3.14159;
		
		try (Scanner sc = new Scanner(System.in)) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			double areaTriangulo = (a * c) / 2.0;
			double areaCirculo = PI * Math.pow(c, 2.0);
			double areaTrapezio = ((a + b) * c) / 2.0;
			double areaQuadrado = Math.pow(b, 2.0);
			double areaRetangulo = a * b;
			
			System.out.printf("TRIÂNGULO: %.3f%n", areaTriangulo);
			System.out.printf("CÍRCULO: %.3f%n", areaCirculo);
			System.out.printf("TRAPÉZIO: %.3f%n", areaTrapezio);
			System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
			System.out.printf("RETÂNGULO: %.3f%n", areaRetangulo);
		}
	}
}
