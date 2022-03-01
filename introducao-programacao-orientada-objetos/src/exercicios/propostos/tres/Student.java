package exercicios.propostos.tres;

public class Student {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;

	public double finalGrade() {
		return this.grade1 + this.grade2 + this.grade3;
	}

	public double missingPoints() {
		if (this.finalGrade() < 60.0) {
			return 60.0 - this.finalGrade();
		}
		return 0.0;
	}

	@Override
	public String toString() {
		return String.format("%.2f", this.finalGrade());
	}
}
