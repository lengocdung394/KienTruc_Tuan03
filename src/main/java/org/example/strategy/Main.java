package org.example.strategy;

public class Main {

        public static void main(String[] args) {
            Order order = new Order("Đơn hàng 1");

            // Chọn chiến lược

            // Quy trình bình thường
            order.process(); // Mới tạo → Đang xử lý
            order.process(); // Đang xử lý → Đã giao
            order.process(); // Đã giao

            System.out.println("---- Hủy đơn thử ----");
            Order order2 = new Order("Đơn hàng 2");

            order2.cancel(); // Hủy ngay
        }

}
