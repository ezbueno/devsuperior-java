package com.buenoezandro.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.buenoezandro.entities.Category;
import com.buenoezandro.entities.Order;
import com.buenoezandro.entities.Product;
import com.buenoezandro.entities.User;
import com.buenoezandro.entities.enums.OrderStatus;
import com.buenoezandro.repositories.CategoryRepository;
import com.buenoezandro.repositories.OrderRepository;
import com.buenoezandro.repositories.ProductRepository;
import com.buenoezandro.repositories.UserRepository;

@Configuration
@Profile(value = "test")
public class TestConfig implements CommandLineRunner {
	private final UserRepository userRepository;
	private final OrderRepository orderRepository;
	private CategoryRepository categoryRepository;
	private ProductRepository productRepository;

	public TestConfig(UserRepository userRepository, OrderRepository orderRepository,
			CategoryRepository categoryRepository, ProductRepository productRepository) {
		this.userRepository = userRepository;
		this.orderRepository = orderRepository;
		this.categoryRepository = categoryRepository;
		this.productRepository = productRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");

		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");

		this.categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		this.productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

		p1.getCategories().add(cat2);
		p2.getCategories().add(cat1);
		p2.getCategories().add(cat3);
		p3.getCategories().add(cat3);
		p4.getCategories().add(cat3);
		p5.getCategories().add(cat2);

		this.productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "654321");

		Order o1 = new Order(null, Instant.parse("2022-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2022-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2022-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);

		this.userRepository.saveAll(Arrays.asList(u1, u2));
		this.orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
}
