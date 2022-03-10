package listas;

import java.util.ArrayList;
import java.util.List;

public class Program {
	private static final String SEPARATOR = "---------------------";

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");

		System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println(SEPARATOR);

		list.removeIf(name -> name.startsWith("M"));

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println(SEPARATOR);
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println(SEPARATOR);

		list.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);

		System.out.println(SEPARATOR);

		String name = list.stream().filter(n -> n.startsWith("A")).findFirst().orElse(null);
		System.out.println(name);
	}
}
