package com.softpro.DefenceAspirantPortal.Notification.NotificationEntity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "physical_medical_standards")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PhysicalMedicalStandards {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "running_time_and_distance", length = 2000)
    private String runningTimeAndDistance;

    @Column(name = "pushups_situps_chinups_requirements", length = 2000)
    private String pushupsSitupsChinupsRequirements;

    @Column(name = "eye_sight_color_blindness_tattoos_policy", length = 2000)
    private String eyeSightColorBlindnessTattoosPolicy;

    @Column(name = "medical_tests_list", length = 2000)
    private String medicalTestsList;

    @Column(name = "physical_standards_pdf_link")
    private String physicalStandardsPdfLink;
}
