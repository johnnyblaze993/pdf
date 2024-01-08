package com.example.repositories;



import com.example.entities.AssessmentData;

import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;
import java.util.List;
import java.util.UUID;

@JdbcRepository(dialect = Dialect.POSTGRES)
public interface AssessmentDataRepository extends CrudRepository<AssessmentData, UUID> {

    List<AssessmentData> findByAssessmentId(UUID assessmentId);


}
