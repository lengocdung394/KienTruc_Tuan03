package org.example.state;

public class PaymentContext {
    private PaymentState state;

    public PaymentContext() {
        state = new UnpaidState();
    }

    public void setState(PaymentState state) {
        this.state = state;
    }

    public void process() {
        state.handle(this);
    }
}
