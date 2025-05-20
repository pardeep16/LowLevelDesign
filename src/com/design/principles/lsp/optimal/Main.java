package com.design.principles.lsp.optimal;

public class Main {
    public static void main(String[] args) {
        VisaCard creditCard = new VisaCreditCard();
        CreditCard creditCard1 = new RupayCreditCard();

        creditCard.swipeCard();
    }
}
