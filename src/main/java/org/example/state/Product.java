package org.example.state;

public class Product {
    private ProductState state;

    public Product() {
        state = new NewStateProduct(); // ban đầu
    }

    public void setState(ProductState state) {
        this.state = state;
    }

    public void process() {
        state.handle(this);
    }
}
