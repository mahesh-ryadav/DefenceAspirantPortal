package com.softpro.DefenceAspirantPortal.Notification.NotificationEntity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "important_dates")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ImportantDates {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Notification release date is required")
    private LocalDate notificationReleaseDate;

    @NotNull(message = "Application start date is required")
    private LocalDate applicationStartDate;

    @NotNull(message = "Application end date is required")
    private LocalDate applicationEndDate;

    private String applicationCorrectionWindow; // You can keep it as a string or period format

    private LocalDate admitCardDate;

    private LocalDate writtenExamDate;

    private LocalDate resultDate;

    private LocalDate ssbInterviewStart;

    private LocalDate finalMeritListDate;

}
