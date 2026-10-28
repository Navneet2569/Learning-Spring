package com.learning.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// SpringApplication.run(Application.class, args);
		// HelloController helloController = new HelloController();

		// System.out.println(helloController.hello());

		// Started learning Maven

		// Learning DI and IoC in Spring Framework.
		// PaymentService service = new PaymentService();
		// OrderService order = new OrderService(service);
		// order.placeOrder();

		// Learning and Implementing DI and IoC in Spring Framework.
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		OrderService orderService = context.getBean(OrderService.class);
		orderService.placeOrder();
	}

}
