package classes.metodos.abstratos.program.exercicio.fixacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import classes.metodos.abstratos.entities.exercicio.fixacao.Company;
import classes.metodos.abstratos.entities.exercicio.fixacao.Individual;
import classes.metodos.abstratos.entities.exercicio.fixacao.TaxPayer;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usuário), os quais 
 * podem ser pessoa física ou pessoa jurídica, e depois mostrar o valor do imposto pago por cada um, 
 * bem como o total de imposto arrecadado. 
 * Os dados de pessoa física são: nome, renda anual e gastos com saúde. Os dados de pessoa jurídica 
 * são nome, renda anual e número de funcionários. As regras para cálculo de imposto são as 
 * seguintes:
 * Pessoa física: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com 
 * renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com saúde, 50% 
 * destes gastos são abatidos no imposto. 
 * Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com saúde, o imposto 
 * fica: (50000 * 25%) - (2000 * 50%) = 11500.00
 * Pessoa jurídica: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10 
 * funcionários, ela paga 14% de imposto. 
 * Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcionários, o imposto fica: 
 * 400000 * 14% = 56000.00
 * 
 * Example:
 * 
 * Enter the number of tax payers: 3
 * Tax payer #1 data:
 * Individual or company (i/c)? i
 * Name: Alex
 * Anual income: 50000.00
 * Health expenditures: 2000.00
 * Tax payer #2 data:
 * Individual or company (i/c)? c
 * Name: SoftTech
 * Anual income: 400000.00
 * Number of employees: 25
 * Tax payer #3 data:
 * Individual or company (i/c)? i
 * Name: Bob
 * Anual income: 120000.00
 * Health expenditures: 1000.00
 * 
 * TAXES PAID:
 * Alex: $ 11500.00
 * SoftTech: $ 56000.00
 * Bob: $ 29500.00
 * 
 * TOTAL TAXES: $ 97000.00
 */
public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<TaxPayer> taxPayers = new ArrayList<>();

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the number of tax payers: ");
			int n = sc.nextInt();

			for (int i = 0; i < n; i++) {
				System.out.println("Tax payer #" + (i + 1) + " data:");
				System.out.print("Individual or company (i/c)? ");
				char ch = sc.next().charAt(0);

				System.out.print("Name: ");
				String name = sc.next();

				System.out.print("Anual income: ");
				Double anualIncome = sc.nextDouble();

				if (ch == 'i') {
					System.out.print("Health expenditures: ");
					Double healthExpenditures = sc.nextDouble();
					taxPayers.add(new Individual(name, anualIncome, healthExpenditures));
				} else {
					System.out.print("Number of employees: ");
					Integer numberOfEmployees = sc.nextInt();
					taxPayers.add(new Company(name, anualIncome, numberOfEmployees));
				}
			}

			System.out.println();
			System.out.println("TAXES PAID:");
			for (TaxPayer taxPayer : taxPayers) {
				System.out.println(taxPayer);
			}

			System.out.println();

			double totalTaxes = 0.0;

			for (TaxPayer taxPayer : taxPayers) {
				totalTaxes += taxPayer.tax();
			}

			System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTaxes));
		}
	}
}
