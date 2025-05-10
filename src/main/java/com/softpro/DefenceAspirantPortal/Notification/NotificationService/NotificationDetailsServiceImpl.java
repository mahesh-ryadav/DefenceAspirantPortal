package com.softpro.DefenceAspirantPortal.Notification.NotificationService;

import com.softpro.DefenceAspirantPortal.Notification.NotificationDto.NotificationDetailsDto;
import com.softpro.DefenceAspirantPortal.Notification.NotificationEntity.NotificationDetails;
import com.softpro.DefenceAspirantPortal.Notification.NotificationRepository.NotificationDetailsRepository;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class NotificationDetailsServiceImpl implements NotificationDetailsService {

    private final NotificationDetailsRepository notificationDetailsRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<NotificationDetailsDto> getAllNotificationDetails() {
        List<NotificationDetails> entities = notificationDetailsRepository.findAll();
        return entities.stream()
                .map(entity -> modelMapper.map(entity, NotificationDetailsDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public void saveNotificationDetails(NotificationDetailsDto dto) {
        NotificationDetails entity = modelMapper.map(dto, NotificationDetails.class);
        notificationDetailsRepository.save(entity);
    }

    @Override
    public NotificationDetailsDto getNotificationDetailsById(Long id) {
        return notificationDetailsRepository.findById(id)
                .map(entity -> modelMapper.map(entity, NotificationDetailsDto.class))
                .orElse(null);
    }
}
