package com.softpro.DefenceAspirantPortal.Notification.NotificationDto;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.JoinColumn;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EligibilityCriteriaDto {
    private String nationalityEn;

    private String nationalityHi;


    private List<String> ageLimitEn;

    private List<String> ageLimitHi;


    private List<String> genderEligibilityEn;

    private List<String> genderEligibilityHi;


    private List<String> educationalQualificationsEn;
    private List<String> educationalQualificationsHi;
    private List<String> physicalStandardsEn;

    private List<String> physicalStandardsHi;

    private String maritalStatusEn;

    private String maritalStatusHi;


    private List<String> heightRequirementEn;

    private List<String> heightRequirementHi;
}
