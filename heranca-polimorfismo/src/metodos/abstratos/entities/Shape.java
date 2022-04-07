package metodos.abstratos.entities;

import metodos.abstratos.entities.enums.Color;

public abstract class Shape {
	private Color color;

	protected Shape() {
	}

	protected Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return this.color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public abstract double area();
}
