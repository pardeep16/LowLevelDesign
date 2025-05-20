package com.design.principles.lsp.optimal;

// This class represents a Visa credit card.
// It extends the CreditCard class and implements its methods.
// It adheres to the Liskov Substitution Principle (LSP) by ensuring that it can be used in place of its parent class.
// This allows for polymorphism and ensures that subclasses can be used interchangeably with their parent class.
public abstract class VisaCard extends CreditCard {
    public abstract void swipeCard();
    public abstract void tapAndPay();
}
