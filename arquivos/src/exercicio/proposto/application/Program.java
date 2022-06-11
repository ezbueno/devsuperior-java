package exercicio.proposto.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicio.proposto.entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Product> products = new ArrayList<>();

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a folder path: ");
			String strPath = sc.nextLine();

			File path = new File(strPath);
			String sourceFolder = path.getParent();

			new File(sourceFolder + "\\out").mkdir();
			String targetFolder = sourceFolder + "\\out\\summary.csv";

			try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {
				String line = br.readLine();

				while (line != null) {
					String[] separator = line.split(",");

					String name = separator[0].trim();
					Double price = Double.parseDouble(separator[1].trim());
					Integer quantity = Integer.parseInt(separator[2].replace("\"", "").trim());

					products.add(new Product(name, price, quantity));

					line = br.readLine();
				}

				try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFolder, true))) {
					for (Product prod : products) {
						bw.write(prod.getName() + "," + String.format("%.2f", prod.total()) + "\"");
						bw.newLine();
					}
				}

			} catch (FileNotFoundException e) {
				System.out.println("ERROR: File not found!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
