package dev.kunal.paymentservice_aug26.controllers;

import dev.kunal.paymentservice_aug26.dtos.InitiatePaymentDto;
import dev.kunal.paymentservice_aug26.services.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private IPaymentService paymentService;

    //API to call Razorpay payment gateway and generating a Payment Session and getting payment link
    @PostMapping
    public String initiatePayment(@RequestBody InitiatePaymentDto initiatePaymentDto) {
        return paymentService.getPaymentLink(
                initiatePaymentDto.getAmount(),
                initiatePaymentDto.getPhone(),
                initiatePaymentDto.getName(),
                initiatePaymentDto.getEmail(),
                initiatePaymentDto.getOrderId()
        );
    }
}
