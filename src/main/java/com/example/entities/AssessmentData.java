package com.example.entities;

import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.core.annotation.Nullable;
import jakarta.annotation.Nonnull;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.UUID;

@MappedEntity
public class AssessmentData {

    @Nonnull @Id
    private UUID assessmentDataId;

    @Nonnull
    private UUID assessmentId;

    @Nonnull
    private UUID sysDataLabelId;

    @Nullable
    private UUID compositionId;

    @Nullable
    private BigDecimal numericData;

    @Nullable
    private String textData;

    @Nullable
    private UUID mediaId;

    @Nullable
    private Date dateData;

    @Nullable
    private UUID parentAssessmentDataId;

    public UUID getAssessmentDataId() {
        return assessmentDataId;
    }

    public void setAssessmentDataId(UUID assessmentDataId) {
        this.assessmentDataId = assessmentDataId;
    }

    public UUID getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(UUID assessmentId) {
        this.assessmentId = assessmentId;
    }

    public UUID getSysDataLabelId() {
        return sysDataLabelId;
    }

    public void setSysDataLabelId(UUID sysDataLabelId) {
        this.sysDataLabelId = sysDataLabelId;
    }

    public UUID getCompositionId() {
        return compositionId;
    }

    public void setCompositionId(UUID compositionId) {
        this.compositionId = compositionId;
    }

    public BigDecimal getNumericData() {
        return numericData;
    }

    public void setNumericData(BigDecimal numericData) {
        this.numericData = numericData;
    }

    public String getTextData() {
        return textData;
    }

    public void setTextData(String textData) {
        this.textData = textData;
    }

    public UUID getMediaId() {
        return mediaId;
    }

    public void setMediaId(UUID mediaId) {
        this.mediaId = mediaId;
    }

    public Date getDateData() {
        return dateData;
    }

    public void setDateData(Date dateData) {
        this.dateData = dateData;
    }

    public UUID getParentAssessmentDataId() {
        return parentAssessmentDataId;
    }

    public void setParentAssessmentDataId(UUID parentAssessmentDataId) {
        this.parentAssessmentDataId = parentAssessmentDataId;
    }

    // Constructor and getters/setters...
    
}