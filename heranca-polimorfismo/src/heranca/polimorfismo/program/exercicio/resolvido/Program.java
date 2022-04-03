package heranca.polimorfismo.program.exercicio.resolvido;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import heranca.polimorfismo.entities.exercicio.resolvido.Employee;
import heranca.polimorfismo.entities.exercicio.resolvido.OutsourcedEmployee;

/**
 * @author Ezandro Bueno
 * Uma empresa possui funcionários próprios e terceirizados.
 * Para cada funcionário, deseja-se registrar nome, horas
 * trabalhadas e valor por hora. Funcionários terceirizados
 * possuem ainda uma despesa adicional.
 * O pagamento dos funcionários corresponde ao valor da hora
 * multiplicado pelas horas trabalhadas, sendo que os
 * funcionários terceirizados ainda recebem um bônus
 * correspondente a 110% de sua despesa adicional.
 * Fazer um programa para ler os dados de N funcionários (N
 * fornecido pelo usuário) e armazená-los em uma lista. Depois
 * de ler todos os dados, mostrar nome e pagamento de cada
 * funcionário na mesma ordem em que foram digitados.
 * Construa o programa conforme o exemplo abaixo:
 * 
 * Enter the number of employees: 3
 * Employee #1 data:
 * Outsourced (y/n)? n
 * Name: Alex
 * Hours: 50
 * Value per hour: 20.00
 * Employee #2 data:
 * Outsourced (y/n)? y
 * Name: Bob
 * Hours: 100
 * Value per hour: 15.00
 * Additional charge: 200.00
 * Employee #3 data:
 * Outsourced (y/n)? n
 * Name: Maria
 * Hours: 60
 * Value per hour: 20.00
 * 
 * PAYMENTS:
 * Alex - $ 1000.00
 * Bob - $ 1720.00
 * Maria - $ 1200.00
 */
public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Employee> employees = new ArrayList<>();

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the number of employees: ");
			int n = sc.nextInt();

			for (int i = 0; i < n; i++) {
				System.out.println("Employee #" + (i + 1) + " data:");

				System.out.print("Outsourced (y/n)? ");
				char outsourced = sc.next().charAt(0);

				System.out.print("Name: ");
				String name = sc.next();

				System.out.print("Hours: ");
				Integer hours = sc.nextInt();

				System.out.print("Value per hour: ");
				Double valuePerHour = sc.nextDouble();

				if (outsourced == 'y') {
					System.out.print("Additional charge: ");
					Double additionalCharge = sc.nextDouble();

					employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
				} else {
					employees.add(new Employee(name, hours, valuePerHour));
				}
			}
		}

		System.out.println();
		System.out.println("PAYMENTS:");
		employees.forEach(System.out::println);
	}
}
