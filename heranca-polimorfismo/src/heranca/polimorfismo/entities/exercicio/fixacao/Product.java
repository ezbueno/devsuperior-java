package heranca.polimorfismo.entities.exercicio.fixacao;

public class Product {
	protected String name;
	protected Double price;

	public Product() {
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String priceTag() {
		StringBuilder sb = new StringBuilder();

		sb.append(this.name);
		sb.append(" $ " + String.format("%.2f", this.price));

		return sb.toString();
	}
}
