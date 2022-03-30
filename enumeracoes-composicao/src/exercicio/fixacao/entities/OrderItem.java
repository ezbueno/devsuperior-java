package exercicio.fixacao.entities;

public class OrderItem {
	private Integer quantity;
	private Double price;
	private Product product;

	public OrderItem() {
	}

	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Double subTotal() {
		return this.price * this.quantity;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(this.product.getName() + ", ");
		sb.append("$" + String.format("%.2f", this.price) + ", ");
		sb.append("Quantity: " + this.quantity + ", ");
		sb.append("Subtotal: $" + String.format("%.2f", this.subTotal()));

		return sb.toString();
	}
}
