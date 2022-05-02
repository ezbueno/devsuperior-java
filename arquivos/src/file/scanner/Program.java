package file.scanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	private static final String FILE_TXT = "C:\\Cursos\\Udemy\\DevSuperior\\arquivos\\in.txt";

	public static void main(String[] args) {
		File file = new File(FILE_TXT);

		try (Scanner sc = new Scanner(file)) {
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
