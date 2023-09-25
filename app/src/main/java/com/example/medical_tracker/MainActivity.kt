package com.example.medical_tracker

import android.app.Application
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.medical_tracker.Navigation.NavGraphSetup
import com.example.medical_tracker.app.MyApplication
import com.example.medical_tracker.ui.theme.MedicalTrackerTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MedicalTrackerTheme {
               val navController = rememberNavController()
                NavGraphSetup(navController = navController)
            }
        }
    }
}

