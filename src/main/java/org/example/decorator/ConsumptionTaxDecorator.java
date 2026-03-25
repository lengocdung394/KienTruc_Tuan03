package org.example.decorator;

public class ConsumptionTaxDecorator extends TaxDecorator {

    public ConsumptionTaxDecorator(Product product) {
        super(product);
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 1.2;
    }
}
