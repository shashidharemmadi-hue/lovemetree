package com.example.lovemetre.controller;

import com.example.lovemetre.entity.Submission;
import com.example.lovemetre.repository.SubmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Random;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class LoveController {
    @Autowired
    private SubmissionRepository repository;

    @PostMapping("/calculate")
    public Map<String,Object> calculate(@RequestBody Submission submission){

        repository.save(submission);

        int score = new Random().nextInt(41)+60;

        return Map.of(
                "score",score,
                "message","❤️ You both are made for each other!"
        );
    }
}