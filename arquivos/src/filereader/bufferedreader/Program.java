package filereader.bufferedreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
	private static final String FILE_TXT = "C:\\Cursos\\Udemy\\DevSuperior\\arquivos\\in.txt";

	public static void main(String[] args) {
		try (FileReader fr = new FileReader(FILE_TXT); BufferedReader br = new BufferedReader(fr)) {
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
