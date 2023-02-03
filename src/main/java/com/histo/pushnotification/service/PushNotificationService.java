package com.histo.pushnotification.service;

import org.springframework.http.ResponseEntity;

public interface PushNotificationService {
    public ResponseEntity<Object> sendPushNotification();
    // public void onNewToken(String token);
}
