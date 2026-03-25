package org.example.state;

public class PaidState implements PaymentState{
    @Override
    public void handle(PaymentContext context) {
        System.out.println("Đã thanh toán");
    }
}
