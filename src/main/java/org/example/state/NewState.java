package org.example.state;

public class NewState implements OrderState {


    public NewState() {
    }

    @Override
    public void handle(Order order) {
        System.out.println("Kiểm tra thông tin đơn hàng...");
        order.setState(new ProcessingState());
    }
}
