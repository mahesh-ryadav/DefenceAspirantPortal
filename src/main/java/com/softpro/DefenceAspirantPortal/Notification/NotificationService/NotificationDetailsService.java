package com.softpro.DefenceAspirantPortal.Notification.NotificationService;

import com.softpro.DefenceAspirantPortal.Notification.NotificationDto.NotificationDetailsDto;

import java.util.List;

public interface NotificationDetailsService {
    List<NotificationDetailsDto> getAllNotificationDetails();
    void saveNotificationDetails(NotificationDetailsDto dto);
    NotificationDetailsDto getNotificationDetailsById(Long id);
}
