package org.example.decorator;

public class DiscountDecorator extends PaymentDecorator{
    public DiscountDecorator(Payment payment) {
        super(payment);
    }

    public double getAmount() {
        return super.getAmount() - 20;
    }
}
