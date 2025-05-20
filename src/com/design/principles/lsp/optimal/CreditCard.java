package com.design.principles.lsp.optimal;
//This is the base class for all credit cards. It defines the common methods that all credit cards should implement.
// This class is abstract because it is not meant to be instantiated directly.
// This can also be replaced with an interface if needed.
// This class is not a good example of LSP because it does not define a common interface for all credit cards.
public abstract class CreditCard {
    public abstract void makePayment();
    public abstract void getCardDetails();
    public abstract void getCardNumber();
    public abstract void getCardHolderName();
}
