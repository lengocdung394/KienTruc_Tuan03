package org.example.decorator;

public class BasicOrder implements Order {
    @Override
    public double getPrice() {
        return 110;
    }

    @Override
    public String getStatus() {
        return "Don hang";
    }
}
