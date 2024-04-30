package org.example.paymentservice.services;

import com.razorpay.RazorpayException;
import org.example.paymentservice.PaymentGateways.PaymentGateway;
import org.springframework.stereotype.Service;

@Service
public class RazorpayPaymentService implements PaymentService {
    private final PaymentGateway paymentGateway;

    public RazorpayPaymentService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public String initiatePayment(Long orderID, String email) {
        try {
            return paymentGateway.generatePaymentLink(orderID, email);
        } catch (RazorpayException e) {
            throw new RuntimeException(e);
        }
    }
}