package heranca.interfaces.model.entities;

import heranca.interfaces.model.enums.Color;

public abstract class AbstractShape implements Shape {
	private Color color;

	protected AbstractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return this.color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
