package dev.kunal.paymentservice_aug26.paymentgateways;

public interface IPaymentGateway {

    String getPaymentLink(Long amount, String phone, String name, String email, String orderId);
}
