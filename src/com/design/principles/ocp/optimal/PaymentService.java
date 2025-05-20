package com.design.principles.ocp.optimal;

// This class represents a payment service.
// It adheres to the Open/Closed Principle (OCP) by allowing new payment methods to be added
public class PaymentService {

    public void payment(Payment payment){
        payment.completePayment();
    }
}
