package com.softpro.DefenceAspirantPortal.Notification.NotificationRepository;

import com.softpro.DefenceAspirantPortal.Notification.NotificationEntity.NotificationDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationDetailsRepository extends JpaRepository<NotificationDetails, Long> {
}
