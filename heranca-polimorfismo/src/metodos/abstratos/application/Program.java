package metodos.abstratos.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import metodos.abstratos.entities.Circle;
import metodos.abstratos.entities.Rectangle;
import metodos.abstratos.entities.Shape;
import metodos.abstratos.entities.enums.Color;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler os dados de N figuras (N fornecido pelo usuário),
 * e depois mostrar as áreas destas figuras na mesma ordem em que foram digitados.
 * 
 * Enter the number of shapes: 2
 * Shape #1 data:
 * Rectangle or Circle (r/c)? r
 * Color (BLACK/BLUE/RED): BLACK
 * Width: 4.0
 * Height: 5.0
 * Shape #2 data:
 * Rectangle or Circle (r/c)? c
 * Color (BLACK/BLUE/RED): RED
 * Radius: 3.0
 * 
 * SHAPE AREAS:
 * 20.00
 * 28.27
 */
public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Shape> shapes = new ArrayList<>();

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the number of shapes: ");
			int n = sc.nextInt();

			for (int i = 0; i < n; i++) {
				System.out.println("Shape #" + (i + 1) + " data:");

				System.out.print("Rectangle or Circle (r/c)? ");
				char ch = sc.next().charAt(0);

				System.out.print("Color (BLACK/BLUE/RED): ");
				Color color = Color.valueOf(sc.next());

				if (ch == 'r') {
					System.out.print("Width: ");
					double width = sc.nextDouble();

					System.out.print("Height: ");
					double height = sc.nextDouble();

					shapes.add(new Rectangle(color, width, height));
				} else {
					System.out.print("Radius: ");
					double radius = sc.nextDouble();

					shapes.add(new Circle(color, radius));
				}
			}

			System.out.println();
			System.out.println("SHAPE AREAS:");
			for (Shape shape : shapes) {
				System.out.println(String.format("%.2f", shape.area()));
			}
		}
	}
}
