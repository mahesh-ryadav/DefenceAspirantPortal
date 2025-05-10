package com.softpro.DefenceAspirantPortal.Notification.NotificationDto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SelectionProcessDto {
    private String writtenTest;
    private String ssbInterview;
    private String documentVerification;
    private String medicalExamination;
    private String finalMerit;
}
