package org.example.state;

public class ProcessingState implements OrderState {

    public ProcessingState() {
    }

    @Override
    public void handle(Order order) {
        System.out.println("Dong goi don hang");
        order.setState(new DeliveredState());
    }
}
