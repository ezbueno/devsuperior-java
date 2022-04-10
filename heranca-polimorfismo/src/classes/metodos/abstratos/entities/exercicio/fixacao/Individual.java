package classes.metodos.abstratos.entities.exercicio.fixacao;

public class Individual extends TaxPayer {
	private Double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return this.healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		if (this.healthExpenditures < 0.0) {
			this.healthExpenditures = 0.0;
		}

		if (this.anualIncome < 20000.00 && this.healthExpenditures > 0.0) {
			return (this.anualIncome * 0.15) - (this.healthExpenditures * 0.5);
		}

		return (this.anualIncome * 0.25) - (this.healthExpenditures * 0.5);
	}
}
