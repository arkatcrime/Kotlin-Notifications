package com.example.android.eggtimernotifications;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/android/eggtimernotifications/MyFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "TAG", "", "onMessageReceived", "", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "onNewToken", "token", "sendRegistrationToServer", "app_debug"})
public final class MyFirebaseMessagingService extends com.google.firebase.messaging.FirebaseMessagingService {
    private final java.lang.String TAG = "MyFbMessagingService";
    
    @java.lang.Override()
    public void onMessageReceived(@org.jetbrains.annotations.Nullable()
    com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
    
    private final void sendRegistrationToServer(java.lang.String token) {
    }
    
    @java.lang.Override()
    public void onNewToken(@org.jetbrains.annotations.Nullable()
    java.lang.String token) {
    }
    
    public MyFirebaseMessagingService() {
        super();
    }
}