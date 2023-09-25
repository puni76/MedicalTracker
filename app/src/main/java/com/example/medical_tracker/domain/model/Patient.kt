package com.example.medical_tracker.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.medical_tracker.util.Constants.PATIENT_TABLE


@Entity(tableName = PATIENT_TABLE)
data class Patient(
    val name:String,
    val age:String,
    val gender:Int,
    val doctorAssigned:String,
    val prescription:String,
    @PrimaryKey(autoGenerate = true)
    val patientId:Int? = null
)
