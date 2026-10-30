package com.learning.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.learning.spring.payment.PaymentService;

@Component
public class OrderService {

    private PaymentService paymentService;

    public OrderService(@Qualifier("card") PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        paymentService.pay();
        System.out.println("Order placed");

    }
}
