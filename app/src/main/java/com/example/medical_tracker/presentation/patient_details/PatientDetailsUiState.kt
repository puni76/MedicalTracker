package com.example.medical_tracker.presentation.patient_details

data class PatientDetailsUiState(
    val name: String = "",
    val age: String = "",
    val gender: Int = 0,
    val doctorAssigned: String = "",
    val prescription: String = ""
)
