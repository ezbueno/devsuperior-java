package exercicio.fixacao.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import exercicio.fixacao.entities.Client;
import exercicio.fixacao.entities.Order;
import exercicio.fixacao.entities.OrderItem;
import exercicio.fixacao.entities.Product;
import exercicio.fixacao.entities.enums.OrderStatus;

/**
 * @author Ezandro Bueno
 * Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um 
 * sumário do pedido conforme exemplo (próxima página). Nota: o instante do pedido deve ser 
 * o instante do sistema: new Date()
 * Enter cliente data:
 * Name: Alex Green
 * Email: alex@gmail.com
 * Birth date (DD/MM/YYYY): 15/03/1985
 * Enter order data:
 * Status: PROCESSING
 * How many items to this order? 2
 * Enter #1 item data:
 * Product name: TV
 * Product price: 1000.00
 * Quantity: 1
 * Enter #2 item data:
 * Product name: Mouse
 * Product price: 40.00
 * Quantity: 2
 * ORDER SUMMARY:
 * Order moment: 20/04/2018 11:25:09
 * Order status: PROCESSING
 * Client: Alex Green (15/03/1985) - alex@gmail.com
 * Order items:
 * TV, $1000.00, Quantity: 1, Subtotal: $1000.00
 * Mouse, $40.00, Quantity: 2, Subtotal: $80.00
 * Total price: $1080.00
 */
public class Program {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter cliente data:");
			System.out.print("Name: ");
			String clientName = sc.nextLine();
			System.out.print("Email: ");
			String clientEmail = sc.nextLine();
			System.out.print("Birth date (DD/MM/YYYY): ");
			Date birthDate = sdf.parse(sc.next());

			Client client = new Client(clientName, clientEmail, birthDate);

			System.out.println("Enter order data:");
			System.out.print("Status: ");
			OrderStatus status = OrderStatus.valueOf(sc.next());

			Order order = new Order(status, client);

			System.out.print("How many items to this order? ");
			int x = sc.nextInt();

			for (int i = 0; i < x; i++) {
				System.out.println("Enter #" + (i + 1) + " item data:");
				System.out.print("Product name: ");
				sc.nextLine();
				String productName = sc.nextLine();
				System.out.print("Product price: ");
				Double productPrice = sc.nextDouble();
				System.out.print("Quantity: ");
				Integer quantity = sc.nextInt();

				order.addItem(new OrderItem(quantity, productPrice, new Product(productName, productPrice)));
			}

			System.out.println();
			System.out.println(order);
		}
	}
}
