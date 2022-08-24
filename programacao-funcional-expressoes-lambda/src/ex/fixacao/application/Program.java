package ex.fixacao.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import ex.fixacao.entities.Employee;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler os dados (nome, e-mail e salário)
 * de funcionários a partir de um arquivo em formato .csv.
 * Em seguida, mostrar, em ordem alfabética, o e-mail dos funcionários
 * cujo salário seja superior a um dado valor fornecido pelo usuário.
 * Mostrar também a soma dos salários dos funcionários cujo nome começa
 * com a letra 'M'.
 * 
 * Input file:
 * Maria,maria@gmail.com,3200.00
 * Alex,alex@gmail.com,1900.00
 * Marco,marco@gmail.com,1700.00
 * Bob,bob@gmail.com,3500.00
 * Anna,anna@gmail.com,2800.00
 * 
 * Execution:
 * Enter full file path:
 * Enter salary: 2000.00
 * Email of people whose salary is more than 2000.00:
 * anna@gmail.com
 * bob@gmail.com
 * maria@gmail.com
 * Sum of salary of people whose name starts with 'M': 4900.00
 */
public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Employee> employees = new ArrayList<>();
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter full file path: ");
			String path = sc.nextLine();
			
			try (BufferedReader br = new BufferedReader(new FileReader(path))) {
				String line = br.readLine();
				
				while (line != null) {
					String[] fields = line.split(",");				
					employees.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
					line = br.readLine();
				}
				
				System.out.print("Enter salary: ");
				double salary = sc.nextDouble();
				
				List<String> emails = employees
						.stream()
						.filter(e -> e.getSalary() > salary)
						.map(Employee::getEmail)
						.sorted()
						.toList();
				
				System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");
				emails.forEach(System.out::println);
				
				double sum = employees
						.stream()
						.filter(e -> e.getName().toUpperCase().startsWith("M"))
						.map(Employee::getSalary)
						.reduce(0.0, (x, y) -> x + y);
				
				System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));
				
			} catch (IOException e) {
				System.out.println("ERROR: " + e.getMessage());
			}
		}
	}
}
