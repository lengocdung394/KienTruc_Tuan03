package org.example.decorator;

public class CancelDecorator extends OrderDecorator{
    public CancelDecorator(Order order) {
        super(order);
    }
    public String getStatus() {
        return super.getStatus() +
                " → Hủy: Hủy đơn hàng và hoàn tiền";
    }
}
