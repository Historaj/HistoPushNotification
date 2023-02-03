package com.histo.pushnotification.configuration;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.io.FileInputStream;
import java.io.IOException;

// @Configuration
public class PushNotificationConfig {
//    @PostConstruct
//    public static void initAdminSdk() throws IOException {
//
//        String filepath = "./firebase-service-account.json";
//        GoogleCredentials credentials = GoogleCredentials.fromStream(new FileInputStream(filepath));
//        FirebaseOptions options = new FirebaseOptions.Builder()
//                .setCredentials(credentials)
//                //.setDatabaseUrl("your firebase db url")
//                .build();
//
//        FirebaseApp.initializeApp(options);
//    }
}
