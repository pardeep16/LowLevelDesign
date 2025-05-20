package com.design.principles.lsp.optimal;

// This class represents a Visa credit card.
// It extends the CreditCard class and implements its methods.
// It adheres to the Liskov Substitution Principle (LSP) by ensuring that it can be used in place of its parent class.
// This allows for polymorphism and ensures that subclasses can be used interchangeably with their parent class.
public class VisaCreditCard extends VisaCard {

    @Override
    public void swipeCard() {
        // Implementation for swiping the card
    }

    @Override
    public void tapAndPay() {
        // Implementation for tap and pay
    }

    @Override
    public void makePayment() {
        // Implementation for making payment
    }

    @Override
    public void getCardDetails() {
        // Implementation for getting card details
    }

    @Override
    public void getCardNumber() {
        // Implementation for getting card number
    }

    @Override
    public void getCardHolderName() {
        // Implementation for getting card holder name
    }
}
