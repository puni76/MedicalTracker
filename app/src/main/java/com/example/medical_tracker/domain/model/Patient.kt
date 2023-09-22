package com.example.medical_tracker.domain.model

data class Patient(
    val name:String,
    val age:String,
    val gender:Int,
    val doctorAssigned:String,
    val prescription:String,
    val patientId:Int? = null
)
