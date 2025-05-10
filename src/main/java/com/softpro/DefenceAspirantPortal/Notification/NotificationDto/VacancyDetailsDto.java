package com.softpro.DefenceAspirantPortal.Notification.NotificationDto;

import lombok.*;

import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VacancyDetailsDto {
    private int totalVacancies;
    private Map<String, Integer> categoryWiseVacancy;
    private Map<String, Integer> postWiseVacancy;
}
