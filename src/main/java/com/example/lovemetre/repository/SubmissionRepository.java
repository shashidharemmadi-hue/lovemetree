package com.example.lovemetre.repository;

import com.example.lovemetre.entity.Submission;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SubmissionRepository
        extends MongoRepository<Submission, String> {
}