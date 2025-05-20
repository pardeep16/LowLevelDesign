package com.design.principles.ocp.problematic;

// This class represents a payment service that is not open for extension.
// It violates the Open/Closed Principle (OCP) because it requires modification to add new payment types.
// The class is tightly coupled with the PaymentType enum, making it difficult to extend without modifying the existing code.
// This violates the OCP, which states that classes should be open for extension but closed for modification.
public class PaymentService {

    public void completePayment(PaymentType paymentType){
        
        if(paymentType.equals(PaymentType.CARD)){
            
        } else if (paymentType.equals(PaymentType.CASH)) {
            
        } else if (paymentType.equals(PaymentType.UPI)) {
            
        } else if (paymentType.equals(PaymentType.WALLET)) {

        }

    }
}
