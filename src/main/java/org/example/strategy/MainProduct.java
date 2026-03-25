package org.example.strategy;

public class MainProduct {
    public static void main(String[] args) {
        Product p = new Product(100);

        // VAT
        p.setTaxStrategy(new VATStrategy());
        System.out.println("VAT: " + p.getTotalPrice());

        // Thuế tiêu thụ
        p.setTaxStrategy(new ConsumptionTaxStrategy());
        System.out.println("Consumption: " + p.getTotalPrice());

        // Thuế xa xỉ
        p.setTaxStrategy(new LuxuryTaxStrategy());
        System.out.println("Luxury: " + p.getTotalPrice());
    }
}
