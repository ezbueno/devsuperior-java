package exercicios.propostos.tres;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler o nome de um aluno e três notas que ele obteve nos três trimestres do ano
 * (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final 
 * do aluno no ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos
 * pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe
 * Student para resolver este problema.
 * Exemplos:
 * Entrada:
 * Alex Green
 * 27.00
 * 31.00
 * 32.00
 * Saída:
 * FINAL GRADE = 90.00
 * PASS
 * Entrada:
 * Alex Green
 * 17.00
 * 20.00
 * 15.00
 * Saída:
 * FINAL GRADE = 52.00
 * FAILED
 * MISSING 8.00 POINTS
 */
public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		try (Scanner sc = new Scanner(System.in)) {
			Student student = new Student();
			
			student.name = sc.nextLine();
			student.grade1 = sc.nextDouble();
			student.grade2 = sc.nextDouble();
			student.grade3 = sc.nextDouble();
			
			if (student.finalGrade() < 60.0) {
				System.out.println("FINAL GRADE = " + student);
				System.out.println("FAILED");
				System.out.printf("MISSING %.2f POINTS", student.missingPoints());
			} else {
				System.out.println("FINAL GRADE = " + student);
				System.out.println("PASS");
			}
		}
	}
}
