package org.example.strategy;

public class MainPayment {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment());
        context.pay(100);

        context.setStrategy(new PayPalPayment());
        context.pay(200);
    }
}
