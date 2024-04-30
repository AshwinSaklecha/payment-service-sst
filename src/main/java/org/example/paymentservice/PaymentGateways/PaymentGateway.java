package org.example.paymentservice.PaymentGateways;

import com.razorpay.RazorpayException;

public interface PaymentGateway {
    String generatePaymentLink(Long orderId, String email) throws RazorpayException, RazorpayException;
}
