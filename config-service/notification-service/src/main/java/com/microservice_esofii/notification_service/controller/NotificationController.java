package com.microservice_esofii.notification_service.controller;

import com.microservice_esofii.notification_service.model.EmailRequest;
import com.microservice_esofii.notification_service.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @Autowired
    private EmailService emailService;

    // Endpoint para enviar um e-mail simples
    @PostMapping("/send-email")
    public ResponseEntity<String> sendEmail(@RequestBody EmailRequest emailRequest) {
        boolean sent = emailService.sendSimpleEmail(
                emailRequest.getTo(),
                emailRequest.getSubject(),
                emailRequest.getBody()
        );

        if (sent) {
            return new ResponseEntity<>("Email sent successfully!", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Failed to send email. Check logs for details.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}

