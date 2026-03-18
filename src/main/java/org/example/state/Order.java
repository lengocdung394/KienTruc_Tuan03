package org.example.state;

public class Order {

    private RefundStrategy refundStrategy;
    private OrderState state;

    public Order() {
        state = new NewState(); // mặc định
    }

    public RefundStrategy getRefundStrategy() {
        return refundStrategy;
    }
    public void process() {
        state.handle(this);
    }

    public void setState(OrderState state) {
        this.state = state;
    }
}
