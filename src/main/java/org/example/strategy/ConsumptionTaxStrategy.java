package org.example.strategy;

public class ConsumptionTaxStrategy implements TaxStrategy {
    public double calculateTax(double price) {
        return price * 0.2;
    }
}
