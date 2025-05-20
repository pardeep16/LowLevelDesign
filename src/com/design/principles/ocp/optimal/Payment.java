package com.design.principles.ocp.optimal;
/**
 * This interface represents a payment method.
 * It adheres to the Open/Closed Principle (OCP) by allowing new payment methods to be added
 * without modifying existing code.
 */
public interface Payment {

    void completePayment();
}
