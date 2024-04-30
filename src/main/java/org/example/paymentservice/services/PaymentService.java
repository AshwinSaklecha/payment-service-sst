package org.example.paymentservice.services;

public interface PaymentService {
    String initiatePayment(Long id, String email);
}
