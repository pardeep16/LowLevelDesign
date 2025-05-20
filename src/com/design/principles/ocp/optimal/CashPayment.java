package com.design.principles.ocp.optimal;

// This class represents a payment service.
// It adheres to the Open/Closed Principle (OCP) by allowing new payment methods to be added
public class CashPayment implements Payment{
    @Override
    public void completePayment() {

    }
}
