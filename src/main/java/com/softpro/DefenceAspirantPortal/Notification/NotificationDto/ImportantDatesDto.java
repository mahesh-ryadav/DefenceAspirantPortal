package com.softpro.DefenceAspirantPortal.Notification.NotificationDto;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ImportantDatesDto {
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate notificationReleaseDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate applicationStartDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate applicationEndDate;

    private String applicationCorrectionWindow;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate admitCardDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate writtenExamDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate resultDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate ssbInterviewStart;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate finalMeritListDate;
}
