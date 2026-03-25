package org.example.strategy;

public class CashRefund implements RefundStrategy{
    @Override
    public void refund() {
        System.out.println("Hoàn tiền mặt");
    }
}
