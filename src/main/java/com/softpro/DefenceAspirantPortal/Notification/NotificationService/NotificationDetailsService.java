package com.softpro.DefenceAspirantPortal.Notification.NotificationService;

import com.softpro.DefenceAspirantPortal.Notification.NotificationDto.NotificationDetailsDto;
import com.softpro.DefenceAspirantPortal.Notification.NotificationEntity.NotificationDetails;
import com.softpro.DefenceAspirantPortal.Notification.NotificationRepository.NotificationDetailsRepository;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificationDetailsService {

    private final NotificationDetailsRepository notificationDetailsRepository;
    private final ModelMapper modelMapper;

    public void saveNotificationDetails(NotificationDetailsDto dto) {
        NotificationDetails entity = modelMapper.map(dto, NotificationDetails.class);
        notificationDetailsRepository.save(entity);
    }

    public NotificationDetailsDto getNotificationDetailsById(Long id) {
        return notificationDetailsRepository.findById(id)
                .map(entity -> modelMapper.map(entity, NotificationDetailsDto.class))
                .orElse(null);
    }
}
