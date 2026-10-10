package dev.kunal.paymentservice_aug26.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InitiatePaymentDto {

    private Long amount;
    private String phone;
    private String name;
    private String email;
    private String orderId;
}