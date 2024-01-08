package com.example.entities;

import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
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

    private UUID compositionId;

    private BigDecimal numericData;

    private String textData;

    private UUID mediaId;

    private Date dateData;

    private UUID parentAssessmentDataId;

    public AssessmentData(UUID assessmentDataId, UUID assessmentId, UUID sysDataLabelId, UUID compositionId,
                          BigDecimal numericData, String textData, UUID mediaId, Date dateData, UUID parentAssessmentDataId) {
        this.assessmentDataId = assessmentDataId;
        this.assessmentId = assessmentId;
        this.sysDataLabelId = sysDataLabelId;
        this.compositionId = compositionId;
        this.numericData = numericData;
        this.textData = textData;
        this.mediaId = mediaId;
        this.dateData = dateData;
        this.parentAssessmentDataId = parentAssessmentDataId;
    }

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


     
}