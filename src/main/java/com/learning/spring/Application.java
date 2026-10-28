package com.learning.spring;

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
		PaymentService service = new PaymentService();

		OrderService order = new OrderService(service);
		order.placeOrder();
	}

}
