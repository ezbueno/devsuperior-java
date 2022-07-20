package treeset.compara.elementos.entities;

import java.util.Objects;

public class Product implements Comparable<Product> {
	private String name;
	private Double price;

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

	@Override
	public int hashCode() {
		return Objects.hash(this.name, this.price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(this.name, other.name) && Objects.equals(this.price, other.price);
	}

	@Override
	public String toString() {
		return "Product [name=" + this.name + ", price=" + this.price + "]";
	}

	@Override
	public int compareTo(Product other) {
		return this.name.toUpperCase().compareTo(other.getName().toUpperCase());
	}
}
