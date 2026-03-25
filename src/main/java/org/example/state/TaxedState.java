package org.example.state;

public class TaxedState implements ProductState {
    public void handle(Product product) {
        System.out.println("Đã tính thuế xong");
    }
}
