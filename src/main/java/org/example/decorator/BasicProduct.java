package org.example.decorator;

public class BasicProduct implements  Product{
    @Override
    public double getPrice() {
        return 100; // giá gốc
    }
}
