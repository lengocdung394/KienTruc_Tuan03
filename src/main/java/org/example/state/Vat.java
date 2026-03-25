package org.example.state;

public class Vat implements SaleProductState {

    @Override
    public double calculateTax(double price) {
        return price * 0.2;
    }
}
