package com.example.repositories;



import com.example.entities.AssessmentData;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import java.util.List;
import java.util.UUID;

@Repository
public interface AssessmentDataRepository extends CrudRepository<AssessmentData, UUID> {

    List<AssessmentData> findByAssessmentId(UUID assessmentId);
    // ... other necessary methods
}
