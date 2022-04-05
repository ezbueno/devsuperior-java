package heranca.polimorfismo.entities.exercicio.fixacao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date manufactureDate;

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return this.manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();

		sb.append(this.name + " (used) ");
		sb.append(" $ " + this.price);
		sb.append(" (Manufacture date: " + this.sdf.format(this.manufactureDate) + ")");

		return sb.toString();
	}
}
