package metodos.abstratos.entities;

import metodos.abstratos.entities.enums.Color;

public class Circle extends Shape {
	private Double radius;

	public Circle() {
		super();
	}

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return this.radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(this.radius, 2.0);
	}
}
