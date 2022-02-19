package entrada.dados;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {
			int i = sc.nextInt();
			sc.nextLine();
			String s1 = sc.nextLine();
			String s2 = sc.nextLine();
			String s3 = sc.nextLine();

			System.out.println("DADOS DIGITADOS:");
			System.out.println(i);
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
		}
	}
}
