package heranca.polimorfismo.entities.exercicio.fixacao;

public class ImportedProduct extends Product {
	private Double customsFee;

	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return this.customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();

		sb.append(this.name);
		sb.append(" $ " + String.format("%.2f", this.totalPrice()));
		sb.append(" (Customs fee: $ " + String.format("%.2f", this.customsFee) + ")");

		return sb.toString();
	}

	public Double totalPrice() {
		return this.price + this.customsFee;
	}
}
