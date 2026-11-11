package com.learning.spring.payment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PaymentService {

    public void pay() {
        System.out.println("Payment successful");
    }
}
