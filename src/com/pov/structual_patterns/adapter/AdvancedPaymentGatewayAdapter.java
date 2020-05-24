package com.pov.structual_patterns.adapter;

public class AdvancedPaymentGatewayAdapter implements AdvancedPayGateway {

    private PaymentGateway paymentGateway;

    public AdvancedPaymentGatewayAdapter(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public void makePayment(String mobile1, String mobile2) {
        // Get number of account from phone number
        String account1 = null;
        String account2 = null;
        paymentGateway.doPayment(account1, account2);

    }
}
