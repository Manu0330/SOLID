package org.example;



public class creditCardProcessor implements IPaymentProcessor {

    @Override

    public void processPayment(double amount) {

        System.out.println("Processing credit card payment of $" + amount);

    }

}