package org.example.decorator;

public class VATDecorator extends TaxDecorator{
    public VATDecorator(Product product) {
        super(product);
    }
    @Override
    public double getPrice() {
        return super.getPrice() * 1.1;
    }
}
