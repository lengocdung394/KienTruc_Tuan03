package org.example.state;

public class DeliveredState implements OrderState {
    @Override
    public void handle(Order order) {
        System.out.println("Van chuyen don hang");
    }
}
