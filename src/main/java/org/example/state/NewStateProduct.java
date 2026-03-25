package org.example.state;

public class NewStateProduct implements  ProductState {
    public void handle(Product product) {
        System.out.println("Chua tinh thue");
        // chuyen sang trang thai tinh thue
        product.setState(new TaxedState()); // 👉 chuyển state
    }
}

