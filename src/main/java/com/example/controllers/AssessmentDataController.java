package com.example.controllers;

import com.example.entities.AssessmentData;
import com.example.repositories.AssessmentDataRepository;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import jakarta.inject.Inject;
import java.util.List;
import java.util.UUID;

@Controller("/media")
public class AssessmentDataController {

    @Inject
    private AssessmentDataRepository assessmentDataRepository;

    @Get("/for-assessment/{assessmentId}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<AssessmentData> getForAssessmentId(UUID assessmentId) {
        return assessmentDataRepository.findByAssessmentId(assessmentId);
    }
}