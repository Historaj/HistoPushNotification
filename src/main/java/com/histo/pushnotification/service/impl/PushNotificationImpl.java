package com.histo.pushnotification.service.impl;

import com.google.api.client.util.Data;
import com.histo.pushnotification.service.PushNotificationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PushNotificationImpl implements PushNotificationService {
    @Override
    public ResponseEntity<Object> sendPushNotification() {
        return new ResponseEntity<>("Push Notification Send Successfully", HttpStatus.OK);
    }

    /**
     * Called if InstanceID token is updated. This may occur if the security of
     * the previous token had been compromised. Note that this is called when the InstanceID token
     * is initially generated so this is where you would retrieve the token.
     */
//    @Override
//    public void onNewToken(String token) {
//        Data.setFcmToken(getSharedPreferences(HomeActivity.PREFS_FCM, HomeActivity.MODE_PRIVATE), token);
}
