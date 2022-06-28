package interfacecomparable.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import interfacecomparable.entities.Employee;

/**
 * @author Ezandro Bueno
 * Faça um programa para ler um arquivo contendo funcionários (nome e salário) no
 * formato .csv, armazenando-os em uma lista. Depois, ordenar a lista por nome e mostrar
 * o resultado na tela. Nota: o caminho do arquivo pode ser informado "hardcode".
 */
public class Program2 {
	private static final String IN2_TXT = "C:\\Cursos\\Udemy\\DevSuperior\\interfaces\\in2.txt";

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(IN2_TXT))) {
			String employee = br.readLine();

			while (employee != null) {
				String[] fields = employee.split(",");
				employees.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				employee = br.readLine();
			}

			Collections.sort(employees);

			for (Employee emp : employees) {
				System.out.println(emp);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
