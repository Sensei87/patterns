package com.pov.structual_patterns.adapter;

public class PaymentGatewayImp  implements PaymentGateway{
    @Override
    public void doPayment(String account1, String account2) {
        System.out.println("Do payment using Payment Gateway");
    }
}
