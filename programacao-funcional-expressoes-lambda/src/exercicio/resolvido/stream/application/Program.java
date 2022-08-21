package exercicio.resolvido.stream.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicio.resolvido.stream.entities.Product;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler um conjunto de produtos a partir de um
 * arquivo em formato .csv (suponha que exista pelo menos um produto).
 * Em seguida, mostrar o preço médio dos produtos. Depois, mostrar os
 * nomes, em ordem decrescente, dos produtos que possuem preço inferior
 * ao preço médio.
 * 
 * Input file:
 * TV,900.00
 * Mouse,50.00
 * Tablet,350.50
 * HD Case,80.90
 * Computer,850.00
 * Monitor,290.00
 * 
 * Execution:
 * Enter full file path:
 * Average price: 420.23
 * Tablet
 * Mouse
 * Monitor
 * HD Case
 */
public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
				
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter full file path: ");
			String path = sc.nextLine();
			
			try (BufferedReader br = new BufferedReader(new FileReader(path))) {
				String line = br.readLine();
				
				while (line != null) {
					String[] fields = line.split(",");
					String name = fields[0];
					Double price = Double.parseDouble(fields[1]);
					
					list.add(new Product(name, price));
					line = br.readLine();
				}
					
				double average = list.stream().map(Product::getPrice).reduce(0.0, (x, y) -> x + y) / list.size();
				
				System.out.println("Average price: " + String.format("%.2f", average));
				
				Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
								
				List<String> names = list.stream()
						.filter(p -> p.getPrice() < average)
						.map(Product::getName)
						.sorted(comp.reversed())
						.toList();
				
				names.forEach(System.out::println);
							
			} catch (IOException e) {
				System.out.println("ERROR: " + e.getMessage());
			}
		}		
	}
}
