package exercicios.propostos.um;

public class Rectangle {
	public double width;
	public double height;

	public double area() {
		return this.width * this.height;
	}

	public double perimeter() {
		return (this.width + this.width) + (this.height + this.height);
	}

	public double diagonal() {
		return Math.sqrt(Math.pow(this.width, 2.0) + Math.pow(this.height, 2.0));
	}
}
