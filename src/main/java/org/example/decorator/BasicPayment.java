package org.example.decorator;

public class BasicPayment implements Payment {
    @Override
    public double getAmount() {
        return 100;
    }
}
