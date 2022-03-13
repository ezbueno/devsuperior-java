package listas.exercicio.proposto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salário)
 * de N funcionários. Não deve haver repetição de id.
 * 
 * Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
 * Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar
 * uma mensagem para abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
 * conforme exemplos.
 * 
 * Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa ser mudado
 * livremente. Um salário só pode ser aumentado com base em uma operação de aumento por porcentagem
 * dada.
 * 
 * How many employees will be registered? 3
 * 
 * Employee #1:
 * Id: 333
 * Name: Maria Brown
 * Salary: 4000.00
 * 
 * Employe #2:
 * Id: 536
 * Name: Alex Grey
 * Salary: 3000.00
 * 
 * Employee #3:
 * Id: 772
 * Name: Bob Green
 * Salary: 5000.00
 * 
 * Enter the employee id that will have salary increase: 536
 * Enter the percentage: 10.0
 * 
 * List of employees:
 * 333, Maria Brown, 4000.00
 * 536, Alex Grey, 3300.00
 * 772, Bob Green, 5000.00
 * 
 * OR
 * 
 * How many employees will be registered? 2
 * 
 * Employee #1:
 * Id: 333
 * Name: Maria Brown
 * Salary: 4000.00
 * 
 * Employe #2:
 * Id: 536
 * Name: Alex Grey
 * Salary: 3000.00
 * 
 * Enter the employee id that will have salary increase: 776
 * This id does not exit!
 * 
 * List of employees:
 * 333, Maria Brown, 4000.00
 * 536, Alex Grey, 3000.00
 */
public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("How many employees will be registered? ");
			int n = sc.nextInt();

			int id;
			int[] vect = new int[n];
			boolean idNotFound = true;

			List<Employee> employees = new ArrayList<>();
			Employee employee;

			System.out.println();

			for (int i = 0; i < vect.length; i++) {
				System.out.println("Employee #" + (i + 1));
				System.out.print("Id: ");
				id = sc.nextInt();
				sc.nextLine();
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Salary: ");
				double salary = sc.nextDouble();

				employee = new Employee(id, name, salary);
				employees.add(employee);
				System.out.println();
			}

			System.out.print("Enter the employee id that will have salary increase: ");
			id = sc.nextInt();

			for (Employee e : employees) {
				if (e.getId().equals(id)) {
					System.out.print("Enter the percentage: ");
					double percentage = sc.nextDouble();
					e.increaseSalary(percentage);
					idNotFound = false;
					break;
				}
			}

			if (idNotFound) {
				System.out.println("This id does not exist!");
			}

			System.out.println();
			System.out.println("List of employees:");
			employees.forEach(System.out::println);
		}
	}
}
