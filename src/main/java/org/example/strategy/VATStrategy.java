package org.example.strategy;

public class VATStrategy implements TaxStrategy {
    public double calculateTax(double price) {
        return price * 0.1;
    }

}
