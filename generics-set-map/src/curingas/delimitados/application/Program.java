package curingas.delimitados.application;

import java.util.ArrayList;
import java.util.List;

import curingas.delimitados.entities.Circle;
import curingas.delimitados.entities.Rectangle;
import curingas.delimitados.entities.Shape;

/**
 * @author Ezandro Bueno
 * Fazer um método para retornar a soma das áreas de uma lista de figuras
 */
public class Program {
	public static void main(String[] args) {
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));

		System.out.println("Total area: " + totalArea(myCircles));
	}

	private static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;

		for (Shape s : list) {
			sum += s.area();
		}

		return sum;
	}
}
