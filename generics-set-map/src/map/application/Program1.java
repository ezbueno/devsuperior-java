package map.application;

import java.util.Map;
import java.util.TreeMap;

public class Program1 {
	public static void main(String[] args) {
		Map<String, String> cookies = new TreeMap<>();

		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");

		cookies.remove("email");
		cookies.put("phone", "99771133");

		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());

		System.out.println("ALL COOKIES:");
		for (Map.Entry<String, String> key : cookies.entrySet()) {
			System.out.println(key.getKey() + ": " + key.getValue());
		}
	}
}
