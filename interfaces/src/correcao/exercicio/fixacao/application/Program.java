package correcao.exercicio.fixacao.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import correcao.exercicio.fixacao.entities.Contract;
import correcao.exercicio.fixacao.entities.Installment;
import correcao.exercicio.fixacao.services.ContractService;
import correcao.exercicio.fixacao.services.PaypalService;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter contract data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Date (dd/MM/yyyy): ");
			Date date = sdf.parse(sc.next());
			System.out.print("Contract value: ");
			double totalValue = sc.nextDouble();

			Contract contract = new Contract(number, date, totalValue);
			
			System.out.print("Enter number of installments: ");
			int n = sc.nextInt();

			ContractService contractService = new ContractService(new PaypalService());
			contractService.processContract(contract, n);

			System.out.println("Installments:");
			for (Installment i : contract.getInstallments()) {
				System.out.println(i);
			}

		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
