package dev.kunal.paymentservice_aug26.services;

public interface IPaymentService {

    String getPaymentLink(Long amount, String phone, String name, String email, String orderId);
}
