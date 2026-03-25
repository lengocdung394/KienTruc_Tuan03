package org.example.state;

public class MainProduct {
    public static void main(String[] args) {
        Product product = new Product(100);

        product.setState(new Vat());
        System.out.println("VAT: " + product.calculateTotal());

        product.setState(new Special());
        System.out.println("Special: " + product.calculateTotal());

        product.setState(new Luxury());
        System.out.println("Luxury: " + product.calculateTotal());
    }

}
