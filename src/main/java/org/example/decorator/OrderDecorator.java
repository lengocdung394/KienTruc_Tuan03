package org.example.decorator;

public class OrderDecorator implements  Order{
    protected Order order;
    public OrderDecorator(Order order) {
        this.order = order;
    }
    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getStatus() {
        return order.getStatus();
    }
}
