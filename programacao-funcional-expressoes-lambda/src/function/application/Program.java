package function.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import function.entities.Product;

/**
 * @author Ezandro Bueno
 * Fazer um programa que, a partir de uma lista de produtos, gere uma nova
 * lista contendo os nomes dos produtos em caixa alta.
 */
public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).toList();

		names.forEach(System.out::println);
	}
}
