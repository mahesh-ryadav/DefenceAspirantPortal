package com.softpro.DefenceAspirantPortal.Notification.NotificationDto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BasicExamInfoDto {

    private String examTitleEn;
    private String examTitleHi;

    private String overviewEn;
    private String overviewHi;

    private String authorityEn;
    private String authorityHi;

    private String levelEn;
    private String levelHi;

    private String typeEn;
    private String typeHi;

    private String frequencyEn;
    private String frequencyHi;

    private String applicationModeEn;
    private String applicationModeHi;

    private String examModeEn;
    private String examModeHi;

    private String officialWebsiteEn;
    private String officialWebsiteHi;

    private String notificationPdfLinkEn;
    private String notificationPdfLinkHi;
}
