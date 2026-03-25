package org.example.decorator;

public class FeeDecorator extends PaymentDecorator {
    public FeeDecorator(Payment payment) {
        super(payment);
    }

    public double getAmount() {
        return super.getAmount() + 10;
    }
}
