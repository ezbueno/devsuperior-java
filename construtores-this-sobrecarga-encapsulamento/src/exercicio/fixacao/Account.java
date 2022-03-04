package exercicio.fixacao;

public class Account {
	private int number;
	private String holder;
	private double balance;

	public Account() {
	}

	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Account(int number, String holder, double balance) {
		this(number, holder);
		this.balance = balance;
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

	public void deposit(double value) {
		this.balance += value;
	}

	public void withdraw(double value) {
		this.balance = this.balance - value - 5.0;
	}

	@Override
	public String toString() {
		return "Account " + this.number + ", Holder: " + this.holder + ", Balance: $ "
				+ String.format("%.2f", this.balance);
	}
}
