package com.example.medical_tracker.presentation

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import com.example.medical_tracker.R

class SplashActivity : Activity() {

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.drawable.splash)
    }
}
