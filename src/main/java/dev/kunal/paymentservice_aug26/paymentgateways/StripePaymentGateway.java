package dev.kunal.paymentservice_aug26.paymentgateways;

import org.springframework.stereotype.Component;

@Component
public class StripePaymentGateway implements IPaymentGateway{


    @Override
    public String getPaymentLink(Long amount, String phone, String name, String email, String orderId) {
        return "";
    }
}
