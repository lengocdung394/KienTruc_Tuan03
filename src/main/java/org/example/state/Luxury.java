package org.example.state;

public class Luxury implements SaleProductState {
    @Override
    public double calculateTax(double price) {
        return price * 0.4;
    }
}
