package set.application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program1 {
	private static final String TV = "TV";
	private static final String TABLET = "Tablet";
	private static final String NOTEBOOK = "Notebook";
	private static final String SEPARATOR = "--------------";

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

		set.add(TV);
		set.add(TABLET);
		set.add(NOTEBOOK);

		System.out.println(set.contains(NOTEBOOK));

		for (String p : set) {
			System.out.println(p);
		}

		System.out.println(SEPARATOR);

		set = new TreeSet<>();

		set.add(TV);
		set.add(TABLET);
		set.add(NOTEBOOK);

		System.out.println(set.contains(NOTEBOOK));

		for (String p : set) {
			System.out.println(p);
		}

		System.out.println(SEPARATOR);

		set = new LinkedHashSet<>();

		set.add(TV);
		set.add(TABLET);
		set.add(NOTEBOOK);

		System.out.println(set.contains(NOTEBOOK));

		for (String p : set) {
			System.out.println(p);
		}
	}
}
