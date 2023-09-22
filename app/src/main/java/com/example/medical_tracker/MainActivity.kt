package com.example.medical_tracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.medical_tracker.presentation.patient_details.PatientDetailsScreen
import com.example.medical_tracker.presentation.patient_details.PatientDetailsViewModel
import com.example.medical_tracker.ui.theme.MedicalTrackerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MedicalTrackerTheme {
                val viewModel = viewModel<PatientDetailsViewModel>()
                PatientDetailsScreen(viewModel)
            }
        }
    }
}

