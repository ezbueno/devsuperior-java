package exercicio.fixacao.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import exercicio.fixacao.entities.enums.OrderStatus;

public class Order {
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date moment;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> items = new ArrayList<>();

	public Order() {
	}

	public Order(OrderStatus status, Client client) {
		this.moment = new Date(System.currentTimeMillis());
		this.status = status;
		this.client = client;
	}

	public OrderStatus getStatus() {
		return this.status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Date getMoment() {
		return this.moment;
	}

	public void addItem(OrderItem item) {
		this.items.add(item);
	}

	public void removeItem(OrderItem item) {
		this.items.remove(item);
	}

	public Double total() {
		double totalPrice = 0.0;
		for (OrderItem item : this.items) {
			totalPrice += item.subTotal();
		}
		return totalPrice;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("ORDER SUMMARY:" + "\n");
		sb.append("Order moment: ");
		sb.append(this.sdf.format(this.moment) + "\n");
		sb.append("Order status: ");
		sb.append(this.status + "\n");
		sb.append("Client: ");
		sb.append(this.client);
		sb.append("Order items: " + "\n");
		
		for (OrderItem item : this.items) {
			sb.append(item + "\n");
		}

		sb.append("Total price: $");
		sb.append(String.format("%.2f", this.total()));

		return sb.toString();
	}
}
