package org.example.decorator;

public class LuxuryTaxDecorator extends TaxDecorator {
    public LuxuryTaxDecorator(Product product) {
        super(product);
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 1.3;
    }
}
