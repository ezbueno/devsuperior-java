package heranca.polimorfismo.application;

import heranca.polimorfismo.entities.Account;
import heranca.polimorfismo.entities.BusinessAccount;
import heranca.polimorfismo.entities.SavingsAccount;

public class Program {
	public static void main(String[] args) {
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		/* UPCASTING */
		Account acc2 = bacc;
		Account acc3 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc4 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		/* DOWNCASTING */
		BusinessAccount bacc2 = (BusinessAccount) acc3;
		bacc2.loan(100.0);
			
		if (acc4 instanceof BusinessAccount ba) {
			ba = (BusinessAccount) acc4;
			ba.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc4 instanceof SavingsAccount sa) {
			sa = (SavingsAccount) acc4;
			sa.updateBalance();
			System.out.println("Update!");
		}
	}
}
