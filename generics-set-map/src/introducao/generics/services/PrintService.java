package introducao.generics.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
	private List<T> list = new ArrayList<>();

	public void addValue(T value) {
		this.list.add(value);
	}

	public T first() {
		if (this.list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return this.list.get(0);
	}

	public void print() {
		System.out.print("[");

		if (!this.list.isEmpty()) {
			System.out.print(this.list.get(0));
		}

		for (int i = 1; i < this.list.size(); i++) {
			System.out.print(", " + this.list.get(i));
		}

		System.out.println("]");
	}
}
