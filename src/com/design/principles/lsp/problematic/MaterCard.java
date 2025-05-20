package com.design.principles.lsp.problematic;
// This class represents a MasterCard.
// It extends the CreditCard class and implements the Payment interface.
// It violates the Liskov Substitution Principle (LSP) because it does not provide a valid implementation
// for the upiPayment method, which is expected to be implemented by all subclasses of CreditCard.
public class MaterCard extends CreditCard {

    @Override
    public void tapAndPay() {
        // Implementation for tap and pay
    }

    @Override
    public void swipeAndPay() {
        // Implementation for swipe and pay
    }

    @Override
    public void insertAndPay() {
        // Implementation for insert and pay
    }

    @Override
    public void payWithCard() {
        // Implementation for pay with card
    }

    @Override
    public void payWithCard(String cardNumber) {
        // Implementation for pay with card using card number
    }

    @Override
    public void upiPayment() {
        throw  new UnsupportedOperationException("UPI payment is not supported for MasterCard.");
    }
}
