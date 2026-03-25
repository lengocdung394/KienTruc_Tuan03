package org.example.state;

public class UnpaidState implements PaymentState {
    @Override
    public void handle(PaymentContext context) {
        System.out.println("Chưa thanh toán");
        context.setState(new PaidState());
    }
}
