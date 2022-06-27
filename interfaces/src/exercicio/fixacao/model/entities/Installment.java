package exercicio.fixacao.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date dueDate;
	private Double amount;

	public Installment() {
	}

	public Installment(Date dueDate, Double amount) {
		this.dueDate = dueDate;
		this.amount = amount;
	}

	public Date getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return this.sdf.format(this.getDueDate()) + " - " + String.format("%.2f", this.getAmount());
	}
}
