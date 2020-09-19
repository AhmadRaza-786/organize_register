package com.example.organize.config;

import com.google.firebase.auth.FirebaseAuth;

public class ConfigurationFirebase {
    private static FirebaseAuth authentication;

    public static FirebaseAuth getFirebaseAuthentication() {
        if (authentication == null) {
            authentication = FirebaseAuth.getInstance();
        }
        return authentication;
    }
}
