package org.example.decorator;

public class MainProduct {
    public static void main(String[] args) {
        Product product = new BasicProduct();

        // thêm thuế
        product = new VATDecorator(product);
        product = new ConsumptionTaxDecorator(product);
        product = new LuxuryTaxDecorator(product);

        System.out.println("Giá cuối: " + product.getPrice());
    }
}
