package com.challenge.order;

import com.challenge.order.entities.Order;
import com.challenge.order.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Inicia a aplicação Spring Boot
@SpringBootApplication
public class OrderApplication implements CommandLineRunner {

	private OrderService orderService;

	public OrderApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run  (OrderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("================================");

		Order order = new Order("134", 150.00, 20.0);
		System.out.println("Pedido código:" + order.getCode());
		System.out.println("Valor total:" + orderService.total(order));

		System.out.println("================================");

		Order order2 = new Order("2282", 800.00, 10.0);
		System.out.println("Pedido código:" + order2.getCode());
		System.out.println("Valor total:" + orderService.total(order2));

		System.out.println("================================");

		Order order3 = new Order("1309", 95.90, 0.0);
		System.out.println("Pedido código:" + order3.getCode());
		System.out.println("Valor total:" + orderService.total(order3));

		System.out.println("================================");
	}

}
