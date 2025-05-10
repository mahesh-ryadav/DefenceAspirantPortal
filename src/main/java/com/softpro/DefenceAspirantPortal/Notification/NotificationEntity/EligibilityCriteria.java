package com.softpro.DefenceAspirantPortal.Notification.NotificationEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import lombok.*;
import java.util.List;

@Entity
@Table(name = "eligibility_criteria")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EligibilityCriteria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-generate the ID value
    private Long id;

    // Nationality
    @NotBlank(message = "Nationality (English) is required")
    private String nationalityEn;

    @NotBlank(message = "Nationality (Hindi) is required")
    private String nationalityHi;

    // Age Limit (List of strings for multiline text)
    @NotNull(message = "Age Limit (English) is required")
    @ElementCollection
    @CollectionTable(name = "age_limit_en", joinColumns = @JoinColumn(name = "eligibility_criteria_id"))
    @Column(name = "age_limit_en")
    private List<String> ageLimitEn;

    @NotNull(message = "Age Limit (Hindi) is required")
    @ElementCollection
    @CollectionTable(name = "age_limit_hi", joinColumns = @JoinColumn(name = "eligibility_criteria_id"))
    @Column(name = "age_limit_hi")
    private List<String> ageLimitHi;

    // Gender Eligibility (List of strings for multiline text)
    @NotNull(message = "Gender Eligibility (English) is required")
    @ElementCollection
    @CollectionTable(name = "gender_eligibility_en", joinColumns = @JoinColumn(name = "eligibility_criteria_id"))
    @Column(name = "gender_eligibility_en")
    private List<String> genderEligibilityEn;

    @NotNull(message = "Gender Eligibility (Hindi) is required")
    @ElementCollection
    @CollectionTable(name = "gender_eligibility_hi", joinColumns = @JoinColumn(name = "eligibility_criteria_id"))
    @Column(name = "gender_eligibility_hi")
    private List<String> genderEligibilityHi;

    // Educational Qualifications (List of strings for multiline text)
    @NotNull(message = "Educational Qualifications (English) is required")
    @ElementCollection
    @CollectionTable(name = "educational_qualifications_en", joinColumns = @JoinColumn(name = "eligibility_criteria_id"))
    @Column(name = "educational_qualifications_en")
    private List<String> educationalQualificationsEn;

    @NotNull(message = "Educational Qualifications (Hindi) is required")
    @ElementCollection
    @CollectionTable(name = "educational_qualifications_hi", joinColumns = @JoinColumn(name = "eligibility_criteria_id"))
    @Column(name = "educational_qualifications_hi")
    private List<String> educationalQualificationsHi;

    @NotNull(message = "Physical Standards (English) are required")
    @ElementCollection
    @CollectionTable(name = "physical_standards_en", joinColumns = @JoinColumn(name = "eligibility_criteria_id"))
    @Column(name = "physical_standards_en")
    private List<String> physicalStandardsEn;

    @NotNull(message = "Physical Standards (Hindi) are required")
    @ElementCollection
    @CollectionTable(name = "physical_standards_hi", joinColumns = @JoinColumn(name = "eligibility_criteria_id"))
    @Column(name = "physical_standards_hi")
    private List<String> physicalStandardsHi;

    // Marital Status (Single Line)
    @NotBlank(message = "Marital Status (English) is required")
    private String maritalStatusEn;

    @NotBlank(message = "Marital Status (Hindi) is required")
    private String maritalStatusHi;

    // Height / Chest / Weight Requirements (List of strings for multiline text)
    @NotNull(message = "Height / Chest / Weight Requirements (English) are required")
    @ElementCollection
    @CollectionTable(name = "height_weight_chest_requirements_en", joinColumns = @JoinColumn(name = "eligibility_criteria_id"))
    @Column(name = "height_weight_chest_requirements_en")
    private List<String> heightRequirementEn;

    @NotNull(message = "Height / Chest / Weight Requirements (Hindi) are required")
    @ElementCollection
    @CollectionTable(name = "height_weight_chest_requirements_hi", joinColumns = @JoinColumn(name = "eligibility_criteria_id"))
    @Column(name = "height_weight_chest_requirements_hi")
    private List<String> heightRequirementHi;
}
