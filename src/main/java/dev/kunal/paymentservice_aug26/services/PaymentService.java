package dev.kunal.paymentservice_aug26.services;

import dev.kunal.paymentservice_aug26.paymentgateways.IPaymentGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PaymentService implements IPaymentService{

    @Qualifier("stripePaymentGateway")
    @Autowired
    private IPaymentGateway paymentGateway;

//    public PaymentService(@Qualifier("stripePaymentGateway") IPaymentGateway paymentGateway) {
//        this.paymentGateway = paymentGateway;
//    }

    public String getPaymentLink(Long amount, String phone, String name, String email, String orderId) {
        return paymentGateway.getPaymentLink(amount, phone, name, email, orderId);
    }
}
