package estrutura.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		method1();
		System.out.println("End of program!");
	}

	private static void method1() {
		System.out.println("*** METHOD1 START ***");
		method2();
		System.out.println("*** METHOD1 END ***");
	}

	private static void method2() {
		System.out.println("*** METHOD2 START ***");

		try (Scanner sc = new Scanner(System.in)) {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println("Input error!");
		}

		System.out.println("*** METHOD2 END ***");
	}
}
