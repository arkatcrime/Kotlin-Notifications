package com.example.android.eggtimernotifications

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService : FirebaseMessagingService() {

    private val TAG = "MyFbMessagingService"

    override fun onMessageReceived(remoteMessage: RemoteMessage?) {
        Log.d(TAG, "From: ${remoteMessage?.from}" )
       // super.onMessageReceived(p0)
    }

    private fun sendRegistrationToServer(token: String?){

    }

    override fun onNewToken(token: String?) {
        Log.d(TAG, "Refresh token: $token")

        sendRegistrationToServer(token)
    }

}