package org.example.decorator;

public class ProcessingDecorator extends  OrderDecorator{
    public ProcessingDecorator(Order order) {
        super(order);
    }
    public  String getStatus(){
        return super.getStatus() + "-> Dang xu li : dong goi van chuyen";
    }
}
