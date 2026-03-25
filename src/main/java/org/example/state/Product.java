package org.example.state;

public class Product {
    private double price;
    private SaleProductState state;

    public Product(double price) {
        this.price = price;
    }

    public SaleProductState getState() {
        return state;
    }

    public void setState(SaleProductState state) {
        this.state = state;
    }
    public double calculateTotal() {
        double tax = state.calculateTax(price);
        return price + tax;
    }
}
