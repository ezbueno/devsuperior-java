package interfacecomparable.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Ezandro Bueno
 * Faça um programa para ler um arquivo contendo nomes de pessoas (um nome por 
 * linha), armazenando-os em uma lista. Depois, ordenar os dados dessa lista e mostrá-los 
 * ordenadamente na tela. Nota: o caminho do arquivo pode ser informado "hardcode".
 */
public class Program {
	private static final String IN_TXT = "C:\\Cursos\\Udemy\\DevSuperior\\interfaces\\in.txt";

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(IN_TXT))) {
			String name = br.readLine();

			while (name != null) {
				names.add(name);
				name = br.readLine();
			}

			Collections.sort(names);

			for (String n : names) {
				System.out.println(n);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
