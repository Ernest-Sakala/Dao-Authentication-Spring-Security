package com.project.farmsmart.service;

import com.project.farmsmart.entities.Notification;

import java.util.List;

public interface NotificationService {
    Notification saveNotification(Notification notification);
    Notification getNotification(Long id);
    List<Notification> getAllNotifications();
    Notification updateNotification(Notification notification);
    void deleteNotificationById(Long id);
}
