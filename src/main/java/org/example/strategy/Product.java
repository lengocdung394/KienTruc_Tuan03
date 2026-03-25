package org.example.strategy;

public class Product {
    private double price;
    private TaxStrategy taxStrategy;

    public Product(double price) {
        this.price = price;
    }

    public void setTaxStrategy(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public double getTotalPrice() {
        double tax = taxStrategy.calculateTax(price);
        return price + tax;
    }
}
