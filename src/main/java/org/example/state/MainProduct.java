package org.example.state;

public class MainProduct {
    public static void main(String[] args) {
        Product p = new Product();

        p.process(); // Chưa tính thuế → chuyển state
        p.process(); // Đã tính thuế
    }

}
