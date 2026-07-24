package com.example.lovemetre.controller;


import com.example.lovemetre.entity.Submission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Random;
@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class LoveController {

    @Autowired
    private JavaMailSender mailSender;

    @PostMapping("/calculate")
    public Map<String, Object> calculate(@RequestBody Submission submission) {

        SimpleMailMessage mail = new SimpleMailMessage();

        mail.setTo("shashidhar.emmadi@gmail.com");
        mail.setSubject("New Love Meter Submission");

        mail.setText(
                "Your Name: " + submission.getYourName() +
                        "\nPartner Name: " + submission.getPartnerName()
        );

        mailSender.send(mail);

        int score = new Random().nextInt(41) + 60;

        return Map.of(
                "score", score,
                "message", "❤️ You both are made for each other!"
        );
    }
}