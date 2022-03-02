package membros.estaticos.util;

public final class Calculator {
	public static final double PI = 3.14159;

	private Calculator() {
	}

	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * Math.pow(radius, 3.0) / 3.0;
	}
}
