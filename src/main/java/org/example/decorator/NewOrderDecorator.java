package org.example.decorator;

public class NewOrderDecorator extends OrderDecorator {
    public NewOrderDecorator(Order order) {
        super(order);
    }
    public String getStatus() {
        return  super.getStatus() + "→ Mới tạo: Kiểm tra thông tin đơn hàng";
    }

}
