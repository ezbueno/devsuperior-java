package exercicio.resolvido.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import exercicio.resolvido.entities.Department;
import exercicio.resolvido.entities.HourContract;
import exercicio.resolvido.entities.Worker;
import exercicio.resolvido.entities.enums.WorkerLevel;

/**
 * @author Ezandro Bueno
 * Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar
 * do usuário um mês e mostrar qual foi o salário do funcionário nesse mês, conforme exemplo.
 * 
 * Enter department's name: Design
 * Enter worker data:
 * Name: Alex
 * Level: MID_LEVEL
 * Base salary: 1200.00
 * How many contracts to this worker? 3
 * Enter contract #1 data:
 * Date (DD/MM/YYYY): 20/08/2018
 * Value per hour: 50.00
 * Duration (hours): 20
 * Enter contract #2 data:
 * Date (DD/MM/YYYY): 13/06/2018
 * Value per hour: 30.00
 * Duration (hours): 18
 * Enter contract #3 data:
 * Date (DD/MM/YYYY): 25/08/2018
 * Value per hour: 80.00
 * Duration (hours): 10
 * 
 * Enter month and year to calculate income (MM/YYYY): 08/2018
 * Name: Alex
 * Department: Design
 * Income for 08/2018: 3000.00
 */
public class Program {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);

		Worker worker;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter department's name: ");
			String departmentName = sc.nextLine();

			System.out.println("Enter worker data:");
			System.out.print("Name: ");
			String workerName = sc.nextLine();

			System.out.print("Level: ");
			String workerLevel = sc.nextLine();

			System.out.print("Base salary: ");
			Double baseSalary = sc.nextDouble();

			worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

			System.out.print("How many contracts to this worker? ");
			int n = sc.nextInt();

			int[] vet = new int[n];

			for (int i = 0; i < vet.length; i++) {
				System.out.println("Enter contract # " + (i + 1) + " data:");

				System.out.print("Date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());

				System.out.print("Value per hour: ");
				Double valuePerHour = sc.nextDouble();

				System.out.print("Duration (hours): ");
				Integer hours = sc.nextInt();

				worker.addContract(new HourContract(date, valuePerHour, hours));
			}

			System.out.println();

			System.out.print("Enter month and year to calculate income (MM/YYYY): ");
			String monthAndYear = sc.next();

			Integer month = Integer.parseInt(monthAndYear.substring(0, 2));
			Integer year = Integer.parseInt(monthAndYear.substring(3));

			System.out.println("Name: " + worker.getName());
			System.out.println("Department: " + worker.getDepartment().getName());
			System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		}
	}
}
