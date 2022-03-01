package exemplodois.application;

import java.util.Locale;
import java.util.Scanner;

import exemplodois.entities.Product;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler dados de um produto em estoque (nome, preço e quantidade no estoque). Em seguida:
 * Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no estoque).
 * Realizar uma entrada no estoque e mostrar novamente os dados do produto.
 * Realizar uma saída no estoque e mostrar novamente os dados do produto.
 * Para resolver este problema, você deve criar uma CLASSE conforme projeto abaixo:
 * Product
 *  - Name: string
 *  - Price: double
 *  - Quantity: int
 *  + TotalValueInStock(): double
 *  + AddProducts(quantity: int): void
 *  + RemoveProducts(quantity: int): void
 *  Example:
 *  Enter product data:
 *  Name: TV
 *  Price: 900.00
 *  Quantity in stock: 10
 *  
 *  Product data: TV, $ 900.00, 10 units, Total: $ 9000.00
 *  
 *  Enter the number of products to be added in stock: 5
 *  
 *  Updated data: TV, $ 900.00, 15 units, Total: $ 13500.00
 *  
 *  Enter the number of products to be removed from stock: 3
 *  
 *  Updated data: TV, $ 900.00, 12 units, Total: $ 10800.00
 */
public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {
			Product prod = new Product();

			System.out.println("Enter the product data:");
			System.out.print("Name: ");
			prod.name = sc.nextLine();
			System.out.print("Price: ");
			prod.price = sc.nextDouble();
			System.out.print("Quantity in stock: ");
			prod.quantity = sc.nextInt();

			System.out.println("\nProduct data: " + prod);

			System.out.print("Enter the number of products to be added in stock: ");
			prod.addProducts(sc.nextInt());

			System.out.println("\nUpdated data: " + prod);

			System.out.print("Enter the number of products to be removed from stock: ");
			prod.removeProducts(sc.nextInt());

			System.out.println("\nUpdated data: " + prod);
		}
	}
}
