package org.example.state;

public class Special implements SaleProductState {

    @Override
    public double calculateTax(double price) {
         return price * 0.3;
    }
}
