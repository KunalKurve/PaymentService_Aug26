package dev.kunal.paymentservice_aug26.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stripeWebhook")
public class StripeWebhookController {

//    private ObjectMapper objectMapper = new ObjectMapper();

    // It has to be a POST request because Stripe sends webhook JSON events as POST requests.
    // It will create a lot of information
    // the best way of request-response between 2 applications / microservices / BE-FE
    // is through JSON as a String because I can easily parse it and extract the information I need from it.
    @PostMapping
    public void printStripeEvent(@RequestBody String stripeEvent) {
        // Handle the Stripe webhook event here
        System.out.println("Received Stripe webhook event: " + stripeEvent);
    }

}
