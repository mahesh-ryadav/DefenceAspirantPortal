package com.softpro.DefenceAspirantPortal.Notification.NotificationEntity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import lombok.*;
@Entity
@Table(name = "basic_exam_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BasicExamInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // Exam Title
    @NotBlank(message = "Exam title (English) is required")
    private String examTitleEn;

    @NotBlank(message = "Exam title (Hindi) is required")
    private String examTitleHi;

    // Overview
    @Size(max = 2000, message = "Overview (English) can be up to 2000 characters")
    private String overviewEn;

    @Size(max = 2000, message = "Overview (Hindi) can be up to 2000 characters")
    private String overviewHi;

    // Conducting Authority
    @NotBlank(message = "Conducting authority (English) is required")
    private String authorityEn;

    @NotBlank(message = "Conducting authority (Hindi) is required")
    private String authorityHi;

    // Exam Level
    @NotBlank(message = "Exam level (English) is required")
    private String levelEn;

    @NotBlank(message = "Exam level (Hindi) is required")
    private String levelHi;

    // Exam Type
    @NotBlank(message = "Exam type (English) is required")
    private String typeEn;

    @NotBlank(message = "Exam type (Hindi) is required")
    private String typeHi;

    // Exam Frequency
    @NotBlank(message = "Exam frequency (English) is required")
    private String frequencyEn;

    @NotBlank(message = "Exam frequency (Hindi) is required")
    private String frequencyHi;

    // Mode of Application
    @NotBlank(message = "Application mode (English) is required")
    private String applicationModeEn;

    @NotBlank(message = "Application mode (Hindi) is required")
    private String applicationModeHi;

    // Exam Mode
    @NotBlank(message = "Exam mode (English) is required")
    private String examModeEn;

    @NotBlank(message = "Exam mode (Hindi) is required")
    private String examModeHi;

    // Official Website
    @NotBlank(message = "Official website (English) is required")
    private String officialWebsiteEn;

    @NotBlank(message = "Official website (Hindi) is required")
    private String officialWebsiteHi;

    // Notification PDF Link
    @NotBlank(message = "PDF link (English) is required")
    private String notificationPdfLinkEn;

    @NotBlank(message = "PDF link (Hindi) is required")
    private String notificationPdfLinkHi;
}
