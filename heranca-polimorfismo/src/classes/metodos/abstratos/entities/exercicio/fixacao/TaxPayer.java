package classes.metodos.abstratos.entities.exercicio.fixacao;

public abstract class TaxPayer {
	protected String name;
	protected Double anualIncome;

	protected TaxPayer() {
	}

	protected TaxPayer(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return this.anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}

	public abstract Double tax();

	@Override
	public String toString() {
		return this.name + ": $ " + String.format("%.2f", this.tax());
	}
}
