package entities.enums;

public enum OrderStatus {
	PENDING_PAYMENT("Pending Payment"), 
	PROCESSING("Processing"), 
	SHIPPED("Shipped"), 
	DELIVERED("Delivered");
	
	private String description;

	OrderStatus(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}
}
