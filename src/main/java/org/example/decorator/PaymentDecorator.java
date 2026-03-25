package org.example.decorator;

public class PaymentDecorator implements  Payment{
    protected Payment payment;
    public PaymentDecorator(Payment payment) {
        this.payment = payment;
    }

    public PaymentDecorator() {
    }

    public double getAmount() {
        return payment.getAmount();
    }
}
