package classes.abstratas.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import classes.abstratas.entities.Account;
import classes.abstratas.entities.BusinessAccount;
import classes.abstratas.entities.SavingsAccount;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Account> accounts = new ArrayList<>();

		accounts.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
		accounts.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		accounts.add(new SavingsAccount(1003, "Bob", 300.0, 0.01));
		accounts.add(new BusinessAccount(1004, "Anna", 500.0, 500.0));

		double sum = 0.0;

		for (Account acc : accounts) {
			sum += acc.getBalance();
		}

		System.out.println(String.format("Total balance: %.2f", sum));

		for (Account acc : accounts) {
			acc.deposit(10.0);
		}

		for (Account acc : accounts) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
	}
}
