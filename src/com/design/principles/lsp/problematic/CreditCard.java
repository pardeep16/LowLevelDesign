package com.design.principles.lsp.problematic;

// This class represents a Credit Card.
// It violates the Liskov Substitution Principle (LSP) by not allowing subclasses to be used interchangeably.
// For example, if a subclass of CreditCard does not support UPI payments, it cannot be used in place of the base class.
// This can lead to runtime errors and violates the principle of substitutability.
public abstract class CreditCard {

    public abstract void tapAndPay();
    public abstract void swipeAndPay();
    public abstract void insertAndPay();
    public abstract void payWithCard();
    public abstract void payWithCard(String cardNumber);
    public abstract void upiPayment();

}
