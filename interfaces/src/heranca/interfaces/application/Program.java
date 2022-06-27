package heranca.interfaces.application;

import heranca.interfaces.model.entities.AbstractShape;
import heranca.interfaces.model.entities.Circle;
import heranca.interfaces.model.entities.Rectangle;
import heranca.interfaces.model.enums.Color;

public class Program {
	public static void main(String[] args) {
		AbstractShape abstractShape1 = new Circle(Color.BLACK, 2.0);
		AbstractShape abstractShape2 = new Rectangle(Color.WHITE, 3.0, 4.0);

		System.out.println("Circle color: " + abstractShape1.getColor());
		System.out.println("Circle area: " + String.format("%.3f", abstractShape1.area()));
		System.out.println("Rectangle color: " + abstractShape2.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", abstractShape2.area()));
	}
}
