package org.example.decorator;

public class DeliveredDecorator extends OrderDecorator{
    public DeliveredDecorator(Order order) {
        super(order);
    }

    public String getStatus() {
        return super.getStatus() +
                " → Đã giao: Cập nhật trạng thái đơn hàng";
    }
}
