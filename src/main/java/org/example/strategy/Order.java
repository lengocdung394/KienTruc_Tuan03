package org.example.strategy;

public class Order {
    private String name;
    private String status;
    private ShippingStrategy shippingStrategy;
    private RefundStrategy refundStrategy;

    public Order(String name) {
        this.name = name;
        this.status = "Mới tạo";
    }

    public void setShippingStrategy(ShippingStrategy s) { this.shippingStrategy = s; }
    public void setRefundStrategy(RefundStrategy r) { this.refundStrategy = r; }

    // Xử lý bước tiếp theo
    public void process() {
        switch (status) {
            case "Mới tạo":
                System.out.println(name + ": Kiểm tra thông tin đơn hàng");
                status = "Đang xử lý";
                break;
            case "Đang xử lý":
                System.out.println(name + ": Đóng gói và vận chuyển");
                shippingStrategy.ship();
                status = "Đã giao";
                break;
            case "Đã giao":
                System.out.println(name + ": Đơn hàng đã giao xong");
                break;
            case "Hủy":
                System.out.println(name + ": Đơn hàng bị hủy");
                refundStrategy.refund();
                break;
        }
    }

    public void cancel() {
        status = "Hủy";
        process();
    }

}
