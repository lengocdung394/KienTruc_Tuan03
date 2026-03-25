package org.example.decorator;

public class MainPayment {
    public static void main(String[] args) {
        Payment p = new BasicPayment();

        p = new FeeDecorator(p);
        p = new DiscountDecorator(p);

        System.out.println(p.getAmount()); // 90
    }
}
