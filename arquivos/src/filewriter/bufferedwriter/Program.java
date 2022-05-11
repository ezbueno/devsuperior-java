package filewriter.bufferedwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
	private static final String FILE_TXT = "C:\\temp\\out.txt";

	public static void main(String[] args) {
		String[] lines = new String[] { "Good morning", "Good afternon", "Good night" };

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_TXT, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
