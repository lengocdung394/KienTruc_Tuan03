package org.example.decorator;

public class Main {
    public static void main(String[] args) {

        Order order = new BasicOrder();

        order = new NewOrderDecorator(order);
        order = new ProcessingDecorator(order);
        order = new DeliveredDecorator(order);

        System.out.println(order.getStatus());

        System.out.println("---- Hủy ----");

        Order order2 = new BasicOrder();
        order2 = new CancelDecorator(order2);

        System.out.println(order2.getStatus());
    }
}
