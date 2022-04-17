package exercicio.fixacao.application;

import java.util.Locale;
import java.util.Scanner;

import exercicio.fixacao.entities.Account;
import exercicio.fixacao.exceptions.DomainException;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler os dados de uma conta bancária e depois realizar um 
 * saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer 
 * ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de 
 * saque da conta. Implemente a conta bancária conforme os exemplos abaixo:
 * 
 * Enter account data
 * Number: 8021
 * Holder: Bob Brown
 * Initial balance: 500.00
 * Withdraw limit: 300.00
 * Enter amount for withdraw: 100.00
 * New balance: 400.0
 * 
 * Enter account data
 * Number: 8021
 * Holder: Bob Brown
 * Initial balance: 500.00
 * Withdraw limit: 300.00
 * Enter amount for withdraw: 400.00
 * Withdraw error: The amount exceeds withdraw limit
 * 
 * Enter account data
 * Number: 8021
 * Holder: Bob Brown
 * Initial balance: 500.00
 * Withdraw limit: 300.00
 * Enter amount for withdraw: 800.00
 * Withdraw error: The amount exceeds withdraw limit
 * 
 * Enter account data
 * Number: 8021
 * Holder: Bob Brown
 * Initial balance: 200.00
 * Withdraw limit: 300.00
 * Enter amount for withdraw: 250.00
 * Withdraw error: Not enough balance
 */
public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			Integer number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			Double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();

			Account account = new Account(number, holder, balance, withdrawLimit);

			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			Double amount = sc.nextDouble();
			account.withdraw(amount);
			System.out.print(account);
		} catch (DomainException e) {
			System.out.println(e.getMessage());
		}
	}
}
