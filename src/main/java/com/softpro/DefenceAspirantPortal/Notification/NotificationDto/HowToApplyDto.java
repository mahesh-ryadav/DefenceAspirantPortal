package com.softpro.DefenceAspirantPortal.Notification.NotificationDto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HowToApplyDto {
    private String stepByStepProcedure;
    private String screenshotVisualDemoLink;
    private String applicationPageLink;
}
