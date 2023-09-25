package com.example.medical_tracker.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.medical_tracker.domain.model.Patient

@Database(
    entities = [Patient::class],
    version = 1
)
abstract class PatientDatabase: RoomDatabase() {

    abstract val patientDao: PatientDao
}