package exercicio.fixacao.entities;

import exercicio.fixacao.exceptions.DomainException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return this.holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return this.balance;
	}

	public Double getWithdrawLimit() {
		return this.withdrawLimit;
	}

	public void deposit(Double amount) {
		this.balance += amount;
	}

	public void withdraw(Double amount) throws DomainException {
		if (amount > this.getBalance()) {
			throw new DomainException("Not enough balance");
		}

		if (amount > this.getWithdrawLimit()) {
			throw new DomainException("The amount exceeds withdraw limit");
		}

		this.balance -= amount;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("New balance: %.2f", this.getBalance()));
		return sb.toString();
	}
}
