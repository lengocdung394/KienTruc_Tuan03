package org.example.state;

public class MainPayment {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.process(); // chưa → đã
        context.process(); // đã
    }
}
