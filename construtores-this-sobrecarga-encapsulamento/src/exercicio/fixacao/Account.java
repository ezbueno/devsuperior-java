package exercicio.fixacao;

public class Account {
	private int number;
	private String holder;
	private double balance;

	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Account(int number, String holder, double initialDeposit) {
		this(number, holder);
		this.deposit(initialDeposit);
	}

	public String getHolder() {
		return this.holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getNumber() {
		return this.number;
	}

	public double getBalance() {
		return this.balance;
	}

	public void deposit(double depositValue) {
		this.balance += depositValue;
	}

	public void withdraw(double withdrawValue) {
		this.balance -= withdrawValue + 5.0;
	}

	@Override
	public String toString() {
		return "Account " 
				+ this.number 
				+ ", Holder: " 
				+ this.holder 
				+ ", Balance: $ "
				+ String.format("%.2f", this.balance);
	}
}
