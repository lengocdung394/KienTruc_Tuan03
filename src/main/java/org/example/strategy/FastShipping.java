package org.example.strategy;

public class FastShipping implements ShippingStrategy {
    public void ship() {
        System.out.println("Giao hàng nhanh");
    }
}
