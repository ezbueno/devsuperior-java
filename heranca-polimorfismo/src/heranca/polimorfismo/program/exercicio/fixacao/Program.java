package heranca.polimorfismo.program.exercicio.fixacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import heranca.polimorfismo.entities.exercicio.fixacao.ImportedProduct;
import heranca.polimorfismo.entities.exercicio.fixacao.Product;
import heranca.polimorfismo.entities.exercicio.fixacao.UsedProduct;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler os dados de N produtos (N fornecido pelo usuário). Ao final,
 * mostrar a etiqueta de preço de cada produto na mesma ordem em que foram digitados.
 * Os produtos possuem nome e preço. Produtos importados possuem uma taxa de alfândega, e
 * produtos usados possuem data de fabricação. Estes dados específicos devem ser acrescentados
 * na etiqueta de preço, conforme exemplo. Para produtos importados, a taxa e alfândega deve ser
 * acrescentada ao preço final do produto.
 * 
 * Enter the number of products: 3
 * Product #1 data:
 * Common, used or imported (c/u/i)? i
 * Name: Tablet
 * Price: 260.00
 * Customs fee: 20.00
 * Product #2 data:
 * Common, used or imported (c/u/i)? c
 * Name: Notebook
 * Price: 1100.00
 * Product #3 data:
 * Common, used or imported (c/u/i)? u
 * Name: Iphone
 * Price: 400.00
 * Manufacture date (DD/MM/YYYY): 15/03/2017
 *
 * PRICE TAGS:
 * Tablet $ 280.00 (Customs fee: $ 20.00)
 * Notebook $ 1100.00
 * Iphone (used) $ 400.00 (Manufacture date: 15/03/2017)
 * 
 */
public class Program {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> products = new ArrayList<>();

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the number of products: ");
			int n = sc.nextInt();

			for (int i = 0; i < n; i++) {
				System.out.println("Product #" + (i + 1) + " data:");
				System.out.print("Common, used or imported (c/u/i)? ");
				char response = sc.next().charAt(0);

				System.out.print("Name: ");
				String name = sc.next();

				System.out.print("Price: ");
				Double price = sc.nextDouble();

				if (response == 'i') {
					System.out.print("Customs fee: ");
					Double customsFee = sc.nextDouble();
					products.add(new ImportedProduct(name, price, customsFee));
				} else if (response == 'u') {
					System.out.print("Manufacture date (DD/MM/YYYY): ");
					Date manufactureDate = sdf.parse(sc.next());
					products.add(new UsedProduct(name, price, manufactureDate));
				} else {
					products.add(new Product(name, price));
				}
			}

			System.out.println();
			System.out.println("PRICE TAGS:");
			for (Product prod : products) {
				System.out.println(prod.priceTag());
			}
		}
	}
}
