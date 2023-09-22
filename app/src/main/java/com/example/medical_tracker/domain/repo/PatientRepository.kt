package com.example.medical_tracker.domain.repo

import com.example.medical_tracker.domain.model.Patient
import kotlinx.coroutines.flow.Flow

interface PatientRepository {

    suspend fun addOrUpdatePatient(patient: Patient)

    suspend fun deletePatient(patient: Patient)

    suspend fun getPatientById(patientId: Int): Patient?

    fun getAllPatients(): Flow<List<Patient>>
}